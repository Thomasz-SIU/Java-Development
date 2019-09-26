public class Player {
    private int Number, Hits, Walks, Outs;

    public Player() {
        int Number = Hits = Walks = Outs = 0;
    }

    public int getNumber() {
        return Number;
    }

    public int getHits() {
        return Hits;
    }

    public int getWalks() {
        return Walks;
    }

    public int getOuts()
    {
        return Outs;
    }




    public void setHits(int hits)
    {
        Hits = hits;
    }

    public void setWalks(int walks)
    {
        Walks = walks;
    }

    public void setNumber(int number)
    {
        Number = number;
    }

    public void setOuts(int outs)
    {
        Outs = outs;
    }
    public String toString()
    {
        return Number+"   "+Walks+"   "+Hits+"    "+Outs+"    ";
    }
}

