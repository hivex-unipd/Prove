import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class prova{
	public static void main(String[] args) throws IOException{
		String testo = new tring(Files.readAllBytes(Paths.get("prova.json"))); //errore messo apposta
		System.out.println(testo);
	}
}
