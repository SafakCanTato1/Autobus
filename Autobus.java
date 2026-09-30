public class Autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;
    
        public Autobus(String neuKennzeichen, int neuSitzplatze, 
boolean neuAnhanger)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze(neuSitzplatze);
        setAnhanger(neuAnhanger);
    }
    
    
    public void setKennzeichen (String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }

    public void setSitzplatze(int neuSitzplatze)
    {
        sitzplatze = neuSitzplatze;
    }

    public void setAnhanger(boolean neuAnhanger)
    {
        anhanger =neuAnhanger;
    }
    
}