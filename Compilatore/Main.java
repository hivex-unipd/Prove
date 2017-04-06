import java.io.IOException;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import javax.tools.JavaFileObject;
import javax.tools.DiagnosticCollector;
import javax.tools.Diagnostic;
import javax.tools.StandardJavaFileManager;
import java.util.Arrays;
import java.util.List;
    
public class Main{  
    public static void javaCompile(String fileName) throws IOException {
       
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    DiagnosticCollector<JavaFileObject> diagnosticsCollector = new DiagnosticCollector<JavaFileObject>();
    StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnosticsCollector, null, null);
    Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromStrings(Arrays.asList(fileName));
    JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnosticsCollector, null, null, compilationUnits);
    boolean success = task.call();
    if (!success) {
        List<Diagnostic<? extends JavaFileObject>> diagnostics = diagnosticsCollector.getDiagnostics();
        for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics) {
            // read error dertails from the diagnostic object
            System.out.println(diagnostic.getMessage(null));
        }
    }
    fileManager.close();
    System.out.println("Success: " + success);
    }

	public static void main(String[] args){
		try{
			Main.javaCompile("prova.java");
		}
		catch(IOException e){}
	}
};
