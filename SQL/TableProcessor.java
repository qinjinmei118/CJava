package bits.org.SQL;

import java.io.File;
import java.util.List;

import org.ddd.annotation.example.ClassFileLoader;
import org.ddd.annotation.example.Scanner;
import org.ddd.annotation.example.TableInfo;


public class TableProcessor implements IProcessor{

	public String process(String url) throws Exception {
		List<File> classFiles = Scanner.getClassFiles(url);
		StringBuilder sql = new StringBuilder();
		for(File file : classFiles){
			Class<?> clazz = ClassFileLoader.loadClass(file);
			TableInfo table = TableInfo.parse(clazz);
			if(table != null)
				sql.append(table.toString());
		}
		return sql.toString();
	}

}
