package com.company;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned){
        this.view = new double[numRows][numCols];
        int currentRow = 0;
        while(currentRow != numRows) {
            if(currentRow % 2 == 0) {
                for (int j = 0; j < numCols; j++) {
                    view[currentRow][j] = scanned[currentRow * numCols + j];
                }
                currentRow++;
            }
                else {
                    for (int j = numCols-1;j>=0;j--)
                    {
                        view[currentRow][j] = scanned[currentRow*numCols+j];
                    }
                currentRow++;
                }
            }
        }

    public double getAverage(int startRow,int endRow, int startCol, int endCol){
        double average = 0.0;
        int count = 0;
        for(int i = startRow;i<=endRow;i++){
            for(int j = startCol;j<=endCol;j++){
                average+=view[i][j];
                count++;
            }
        }
        average = average/count;
        return average;
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