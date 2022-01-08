package exercicio1ProfessorResolucao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegistroLog {
	public static void insereLog(String log) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"C:\\Users\\Katia\\eclipse-workspace\\Aula8\\src\\exercicio1ProfessorResolucao\\registro-log.txt",
					true));
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
			bw.write("[" + dataHora + "] " + log);
			bw.close(); // Fecha o arquivo.
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
