package Classi;

import java.util.ArrayList;

public class AssociaLeFrasiTraDiloro {

    String image;
    ArrayList<String> list1=new ArrayList<>();
    ArrayList<String> list2=new ArrayList<>();
    int correttaList1;
    int correttaList2;
    int rispostaUtente1;
    int rispostaUtente2;

    public AssociaLeFrasiTraDiloro(String image, ArrayList<String> list1, ArrayList<String> list2, int correttaList1, int correttaList2) {
        this.image = image;
        this.list1 = list1;
        this.list2 = list2;
        this.correttaList1 = correttaList1;
        this.correttaList2 = correttaList2;
    }

    public String getImage() {
        return image;
    }

    public ArrayList<String> getList1() {
        return list1;
    }

    public ArrayList<String> getList2() {
        return list2;
    }

    public int getCorrettaList1() {
        return correttaList1;
    }

    public int getCorrettaList2() {
        return correttaList2;
    }

    public int getRispostaUtente1() {
        return rispostaUtente1;
    }

    public int getRispostaUtente2() {
        return rispostaUtente2;
    }

    public void setRispostaUtente1(int rispostaUtente1) {
        this.rispostaUtente1 = rispostaUtente1;
    }

    public void setRispostaUtente2(int rispostaUtente2) {
        this.rispostaUtente2 = rispostaUtente2;
    }

    public int cercaPosizioneByString1(String stringa){
        for (int i =0;i< list1.size();i++){
            if(list1.get(i).equalsIgnoreCase(stringa)){
                return i;
            }
        }
        return -1;
    }

    public int cercaPosizioneByString2(String stringa){
        for (int i =0;i< list2.size();i++){
            if(list2.get(i).equalsIgnoreCase(stringa)){
                return i;
            }
        }
        return -1;
    }
}
