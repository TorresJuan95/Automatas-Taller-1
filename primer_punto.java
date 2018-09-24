import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class primer_punto {

	public static void main(String args[]) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// En caso de que q0 sea estado de aceptación accepted = true
		boolean accepted = false;

		int index = 0;
		int size;
		String input;

		try {
			input = br.readLine();
			size = input.length();
			while (!input.equals("FIN")) {

				while (index < size) {

					// Empieza en q0
					if (input.charAt(index) == '0') {

						// llega a q1
						accepted = false;
						index += 1;

						// Ciclo con '0' en q1
						while (index < size && input.charAt(index) == '0')
							index += 1;

						if (index < size && input.charAt(index) == '1') {
							// llego a q2
							index += 1;

							// Ciclo con '0' en q2
							while (index < size && input.charAt(index) == '0')
								index += 1;

							if (index < size && input.charAt(index) == '1') {
								// llega a q3
								index += 1;
								accepted = true;

								// Ciclo con '1' en q3
								while (index < size && input.charAt(index) == '1')
									index += 1;
								
								if (index < size && input.charAt(index) == '0') {
									// llega a q0
									index += 1;
								}

							}
						}

					}
				}
				
				if(accepted)
					bw.write("Cadena aceptada\n");
				else
					bw.write("Cadena rechazada\n");

					bw.flush();
				
				input = br.readLine();
			}

		} catch (Exception ex) {}
	}
}
