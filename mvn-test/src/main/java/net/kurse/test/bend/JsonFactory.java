package net.kurse.test.bend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import net.kurse.test.bo.CharSheet;

public class JsonFactory<T> {

	private static final String TEMP_PATH = "./cst.temp";
	
	private Class<T> type;
	
//	public JsonFactory() {
//		this.type = (Class<T>) getClass();
////		type.getName();
////		type.get
////		String s = new String();
////	}
	
	/**
	 * Ecrit l'objet CharSheet passé en paramètres dans un fichier JSON
	 * @param cs l'objet CharSheet à sauvegarder
	 * @param path le chemin complet du fichier à écrire
	 * @param zipFile indique si le fichier doit être zippé ou non
	 */
	public void write(CharSheet cs, String path, boolean zipFile) {
		String json = writeJson(cs);
		if (zipFile) {
			writeFile(json, null, true);
			zipFile(path);	
			File file = new File(TEMP_PATH);
			file.delete();
		} else {
			writeFile(json, path, false);
		}
	}
	
	/**
	 * Lit le fichier JSON et restitue le résultat sous la forme d'un objet du type passé en paramètre
	 * @param path le chemin du fichier JSON zippé
	 * @param zippedFile indique si le fichier JSON a lire est zippé ou non
	 * @return l'objet CharSheet
	 */
	public T read(String path, boolean zippedFile) {
		File file = null;
		if (zippedFile) {
			file = unzipFile(path);
		} else {
			file = new File(path);
		}
		T result = readJson(file);
		return result;
	}

	private T readJson(File file) {
		T result = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
			result = (T) mapper.readValue(file, type);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private File unzipFile(String path) {
		
		File newFile = null;
		
		byte[] buffer = new byte[1024];

		try {

			ZipInputStream zis = new ZipInputStream(new FileInputStream(path));
			ZipEntry ze = zis.getNextEntry();
				
			String fileName = ze.getName();
		    	
			newFile = new File(fileName);

			FileOutputStream fos = new FileOutputStream(newFile);

			int len;
			while ((len = zis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}

				
			fos.close();

			zis.closeEntry();
			zis.close();

			System.out.println("Done");
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return newFile;
	}
	
	private String writeJson (CharSheet cs) {
		String result = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
			result = mapper.writeValueAsString(cs);
			System.out.println(result);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private void writeFile(String json, String path, boolean zipFile) {
		if (zipFile) path = TEMP_PATH;
		try {
			FileWriter write = new FileWriter(path, false);
			PrintWriter print_line = new PrintWriter(write);
			print_line.print(json);
			print_line.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void zipFile(String path) {
		byte[] buffer = new byte[1024];
    	
    	try{
    		
    		FileOutputStream fos = new FileOutputStream(path);
    		ZipOutputStream zos = new ZipOutputStream(fos);
    		ZipEntry ze= new ZipEntry(UUID.randomUUID().toString());
    		zos.putNextEntry(ze);
    		FileInputStream in = new FileInputStream("./cst.temp");
   	   
    		int len;
    		while ((len = in.read(buffer)) > 0) {
    			zos.write(buffer, 0, len);
    		}

    		in.close();
    		zos.closeEntry();
           
    		//remember close it
    		zos.close();
          
    		System.out.println("Done");

    	}catch(IOException ex){
    	   ex.printStackTrace();
    	}
	}
	
	public Class<?> getType() {
		return this.type;
	}
	
}
