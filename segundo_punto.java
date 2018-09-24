import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class segundo_punto {

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
					if (input.charAt(index) == 'a') {

						// llega a q1
						accepted = false;
						index += 1;

						if (input.charAt(index) == 'c') {

							// llega a q2
							accepted = false;
							index += 1;

							if (input.charAt(index) == 'b') {

								// llega a q3
								accepted = true;
								index += 1;

								if (input.charAt(index) == 'a') {

									// llega a q4
									accepted = true;
									index += 1;

									// Ciclo con 'b' en q4
									while (index < size && input.charAt(index) == 'b')
										index += 1;
									// Ciclo con 'c' en q4
									while (index < size && input.charAt(index) == 'c')
										index += 1;

								}

							} else if (input.charAt(index) == 'a') {

								// llega a q1
								accepted = false;
								index += 1;
							}

						} else if (input.charAt(index) == 'b') {

							// llega a q3
							accepted = true;
							index += 1;

							if (input.charAt(index) == 'a') {

								// llega a q4
								accepted = true;
								index += 1;

								// Ciclo con 'b' en q4
								while (index < size && input.charAt(index) == 'b')
									index += 1;
								// Ciclo con 'c' en q4
								while (index < size && input.charAt(index) == 'c')
									index += 1;

							}

						}

						// Empieza en q0
					} else if (input.charAt(index) == 'b') {

						// llega a q2
						accepted = false;
						index += 1;

						if (input.charAt(index) == 'a') {

							// llega a q1
							accepted = false;
							index += 1;

							if (input.charAt(index) == 'c') {

								// llega a q2
								accepted = false;
								index += 1;

							} else if (input.charAt(index) == 'b') {

								// llega a q3
								accepted = true;
								index += 1;

								if (input.charAt(index) == 'a') {

									// llega a q4
									accepted = true;
									index += 1;

									// Ciclo con 'b' en q4
									while (index < size && input.charAt(index) == 'b')
										index += 1;
									// Ciclo con 'c' en q4
									while (index < size && input.charAt(index) == 'c')
										index += 1;

								}
							}

						} else if (input.charAt(index) == 'b') {

							// llega a q3
							accepted = true;
							index += 1;

							if (input.charAt(index) == 'a') {

								// llega a q4
								accepted = true;
								index += 1;

								// Ciclo con 'b' en q4
								while (index < size && input.charAt(index) == 'b')
									index += 1;
								// Ciclo con 'c' en q4
								while (index < size && input.charAt(index) == 'c')
									index += 1;

							}
						}

						// empieza en q0
					} else if (input.charAt(index) == 'c') {

						// llega a q2
						accepted = false;
						index += 1;
						if (input.charAt(index) == 'a') {

							// llega a q1
							accepted = false;
							index += 1;

							if (input.charAt(index) == 'c') {

								// llega a q2
								accepted = false;
								index += 1;

							} else if (input.charAt(index) == 'b') {

								// llega a q3
								accepted = true;
								index += 1;

								if (input.charAt(index) == 'a') {

									// llega a q4
									accepted = true;
									index += 1;

									// Ciclo con 'b' en q4
									while (index < size && input.charAt(index) == 'b')
										index += 1;
									// Ciclo con 'c' en q4
									while (index < size && input.charAt(index) == 'c')
										index += 1;

								}

							}

						} else if (input.charAt(index) == 'b') {

							// llega a q3
							accepted = true;
							index += 1;

							if (input.charAt(index) == 'a') {

								// llega a q4
								accepted = true;
								index += 1;

								// Ciclo con 'b' en q4
								while (index < size && input.charAt(index) == 'b')
									index += 1;
								// Ciclo con 'c' en q4
								while (index < size && input.charAt(index) == 'c')
									index += 1;

							}
						}

					}

				}

				if (accepted)
					bw.write("Cadena aceptada\n");
				else
					bw.write("Cadena rechazada\n");

				bw.flush();

				input = br.readLine();
			}

		} catch (Exception ex) {
		}

	}
}
