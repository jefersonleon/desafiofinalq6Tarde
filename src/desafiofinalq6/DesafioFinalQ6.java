package desafiofinalq6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class DesafioFinalQ6 {

    /**
     * Em uma eleição presidencial existem quatro candidatos. Os votos são
     * informados através de códigos. Os dados utilizados para a contagem dos
     * votos obedecem à seguinte codificação: 1,2,3,4 = voto para os respectivos
     * candidatos; 5 = voto nulo; 6 = voto em branco; Elabore um algoritmo que
     * leia o código do candidato em um voto. Calcule e escreva: 
     *  total de votos para cada candidato; 
     *  total de votos nulos; 
     *  total de votos em branco; 
     *  o percentual de votos de cada candidato em relação ao total de
     * votos. 
     * Como finalizador do conjunto de votos, tem-se o valor 0.
     */
    public static void main(String[] args) {
        int voto, c1 = 0, c2 = 0, c3 = 0, c4 = 0, vn = 0, vb = 0, vv = 0, vg = 0;
        voto = 10;
        while (voto != 0) {
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu voto:"));
            if(voto==1){
                c1++; vv++;
                JOptionPane.showMessageDialog(null, "Você votou para o candidato 1");
            }else if(voto==2){
                c2++; 
                vv++;
                JOptionPane.showMessageDialog(null, "Você votou para o candidato 2");
            }else if(voto==3){
                c3++; 
                vv++;
                JOptionPane.showMessageDialog(null, "Você votou para o candidato 3");
            }else if(voto==4){
                c4++; 
                vv++;
                JOptionPane.showMessageDialog(null, "Você votou para o candidato 4");
            }else if(voto==5){
                vn++;
                JOptionPane.showMessageDialog(null, "Você votou nulo");
            }else if(voto==6){
                vb++;
                JOptionPane.showMessageDialog(null, "Você votou em branco");
            }else if(voto<0 || voto>6){
                JOptionPane.showMessageDialog(null, "não existe esse candidato!!! "
                        + "vote novamente seu xiru!!");
                vg--;
            }else{
                JOptionPane.showMessageDialog(null, "A eleição foi finalizada!");
                vg--;
            }
           vg++;
        }//fim do loop
        DecimalFormat f = new DecimalFormat("0.0");
        JOptionPane.showMessageDialog(null,"-------------------------------------------------------------\n"
                +"                RESULTADO DA ELEIÇÃO\n"
                + "-------------------------------------------------------------\n"
                + "Candidato 1: "+c1+"\n" 
                + "Candidato 2: "+c2+"\n" 
                + "Candidato 3: "+c3+"\n" 
                + "Candidato 4: "+c4+"\n" 
                + "Votos Nulos: "+vn+"\n" 
                + "Votos em branco: "+vb+"\n"
                + "-------------------------------------------------------------\n"
                + "Quantidade de eleitores que votaram: "+vg+"\n"
                + "Quantidade de votos válidos: "+vv+"\n"
                + "-------------------------------------------------------------\n"
                + "Percentual do Candidato 1: "+f.format((double)c1/vv*100)+"%\n"
                + "Percentual do Candidato 2: "+f.format((double)c2/vv*100)+"%\n"
                + "Percentual do Candidato 3: "+f.format((double)c3/vv*100)+"%\n"
                + "Percentual do Candidato 4: "+f.format((double)c4/vv*100)+"%\n"
        ); 
    }

}
