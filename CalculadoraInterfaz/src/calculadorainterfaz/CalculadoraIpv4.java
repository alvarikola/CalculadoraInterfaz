package calculadorainterfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Calculadora IPv4
Recibe una direccion IPv4 y una máscara y devuelve:
- La direccion de red
- La direccion de broadcast
- La direccion del primer host
- La direccion del último host
*/

public class CalculadoraIpv4 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Solicitar IP y máscara
        System.out.println("Calculadora de direcciones IPv4");
        System.out.println("--------------------------------");
        System.out.println("Direccion IP y máscara: ");
        String entrada = br.readLine();
        System.out.println("");
        System.out.println(entrada);
        // Crear
        Ipv4Address dir = new Ipv4Address(entrada.split("/")[0], entrada.split("/")[1]);
        // Mostrar resultados
        // Mostrar la dirección en binario y en decimal
        System.out.printf("Dirección IP: %s, %s. \n",
                dir.getBinaryAddress(), dir.getIPAddress());
        
        // Mostrar la máscara en binario, en decimal y en CIDR
        System.out.printf("Mascara de red: %s, %s, %s. \n",
                dir.getBinaryMask(), dir.getDecimalMask(), dir.getCIDRMask());
        
        // Mostrar la dirección de red en binario y en decimal
        System.out.printf("Direccion de red: %s, %s. \n",
                dir.getBinaryNetwork(), dir.getDecimalNetwork());
        
        // Mostrar la dirección de broadcast en binario y en decimal
        System.out.printf("Direccion de broadcast: %s, %s. \n",
                dir.getBinaryBroadcast(), dir.getDecimalBroadcast());
        
        // Mostrar la dirección del primer equipo en binario y en decimal
        System.out.printf("Direccion del primer equipo: %s, %s. \n",
                dir.getBinaryFirstHost(), dir.getDecimalFirstHost());
        
        // Mostrar la dirección del último equipo en binario y en decimal
        System.out.printf("Direccion del ultimo equipo: %s, %s. \n",
                dir.getBinaryLastHost(), dir.getDecimalLastHost());
         
        // Mostrar el nº máximo de equipos
        System.out.printf("Maximo numero de equipo: %.0f. \n",
                dir.getMaxHosts());
        
        // Mostrar el tipo de direccion: Pública o privada
        System.out.printf("Tipo de red: %s. \n",
                dir.getType());
    }
    
}
