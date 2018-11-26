package com.company;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned){
        this.view = new double[numRows][numCols];
        int currentRows = 0;
        while(currentRows != numRows) {
            if(currentRows % 2 == 0)
            for (int j = 0; j < numCols; j++) {
                        view[currentRows][j] = scanned[currentRows*numRows+j];
                        currentRows++;
                } else {
                    for (int k = view[j].length - 1; k >= 0; k--) {
                        view[j][k] = scanned[i];
                        currentRows++;
                    }
                }
            }
        }
    }

    public double getAverage(int startRow,int endRow, int startCol, int endCol){
        double result = 0;
        int count = 0;
        for(int i = startRow;i<=endRow;i++){
            for(int j = startCol;j<=endCol;j++){
                result+=view[i][j];
                count++;
            }
        }
        result = result/count;
        return result;
    }

    public String toString(){
        String result = "";
        for(double[] row : view){
            for(double column : row){
                result+=column + " ";
            }
            result+= "\n";
        }
        return result;
    }
}