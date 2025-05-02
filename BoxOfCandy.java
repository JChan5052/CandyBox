public class BoxOfCandy
{
    private Candy[][] box;

    public BoxOfCandy(Candy[][] inc){
        box=inc;
    }
    public boolean moveCandyToFirstRow(int col)
    { 
       for (int i=0;i<box[col].length;i++){
        if (!(box[i][col]==null)) {
          if (!(box[0][col]==null)) return true;
          else {box[0][col]=box[i][col];
            box[i][col]=null;
            return true;
          }
        }
       }
       return false;
    }

    public Candy removeNextByFlavor(String flavor)
    {
        for (int i=box.length-1;i>=0;i--){
            for (int j=0;j<box[i].length;j++){
                if (!(box[i][j]==null)){
                if (box[i][j].getFlavor().equals(flavor)){
                 Candy ret=box[i][j];
                 box[i][j]=null;
                 return ret;
                }
            }
            }
        }
       return null;
    }
    public String toString(){
        String ret="";
        for (int i=0;i<box.length;i++){
            for (int j=0;j<box[i].length;j++){
                ret+=(box[i][j]+" ");
            }
            ret+="\n";
        }
        return ret;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}