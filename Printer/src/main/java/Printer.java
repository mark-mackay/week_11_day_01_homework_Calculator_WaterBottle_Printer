public class Printer {

    private int sheets;
    private int toner;


    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;

    }
    public void subtractJob(int job) {
        this.sheets -= job;
        this.toner -= job;
    }
    public String print(int sheets, int copies){
        int job = sheets * copies;
        if (this.canDoJob(job)) {
            subtractJob(job);
            return "You now have "+this.sheets + " sheets & " + this.toner + " toner left.";
        }
        else
        {
            return "Cannot do job, \nyou only have "+this.sheets + " sheets & " + this.toner
                    + " toner left.\n" + "You require " + job + " on each";
        }
    }

    public boolean canDoJob(int job) {
        return ((this.sheets >= job) && (this.toner >= job));
    }

    public void addSheets(int sheets){
        this.sheets += sheets;
    }
    public void addToner(int toner){
        this.toner += toner;
    }

    public int getSheets(){
        return this.sheets;
    }
    public int getToner(){
        return this.toner;
    }

}
