package passwordgenerator.operation;

import java.util.Scanner;

public interface passwordInterface {
	public String generateNumberPassword(int lenght);

	public String generateCharPassword(int length);

	public String generateCombinePassword(int length);
}
