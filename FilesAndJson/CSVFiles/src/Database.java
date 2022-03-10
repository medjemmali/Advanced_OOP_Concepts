public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
/* TODO
This constructor should take the contents of a CSV file and initialize the memember variables of the Database class.
*/
        String[] cont = contents.split("\\n");
        colNames = cont[0].split(",");
        numRows = cont.length - 1;
        data = new String[numRows][colNames.length];
        for (int i = 1; i < cont.length; i++)
             data[i-1] = cont[i].split(",");
    }
    public String getValue(String columnName,int row){
        int columnInd = 0;
        for(int i = 0;i <colNames.length ; i++){
                if(columnName.equals(colNames[i])){
                    columnInd = i;
                    break;
                }
            }
        return data[row][columnInd];
    }

}


