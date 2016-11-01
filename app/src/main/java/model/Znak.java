package model;

/**
 * Created by Korisnik on 9.9.2016..
 */
public class Znak {

    private String  shifra;
    private String  naziv;
    private String  grupa;
    private String  opis;
    private int     vinjeta;

    private int     uKolicina;
    private String  uDimenzije;
    private String  uKlasa;
    private String  uOpis;

    public Znak() {}

    public Znak(String shifra, String naziv, String grupa, String opis, int vinjeta) {
        this.shifra = shifra;
        this.naziv = naziv;
        this.grupa = grupa;
        this.opis = opis;
        this.vinjeta = vinjeta;
    }

    public int getuKolicina() {
        return uKolicina;
    }

    public void setuKolicina(int uKolicina) {
        this.uKolicina = uKolicina;
    }

    public String getuDimenzije() {
        return uDimenzije;
    }

    public void setuDimenzije(String uDimenzije) {
        this.uDimenzije = uDimenzije;
    }


    public String getuKlasa() {
        return uKlasa;
    }

    public void setuKlasa(String uKlasa) {
        this.uKlasa = uKlasa;
    }

    public String getuOpis() {
        return uOpis;
    }

    public void setuOpis(String uOpis) {
        this.uOpis = uOpis;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getShifra() {
        return shifra;
    }

    public void setShifra(String shifra) {
        this.shifra = shifra;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getVinjeta() {
        return vinjeta;
    }

    public void setVinjeta(int vinjeta) {
        this.vinjeta = vinjeta;
    }
}
