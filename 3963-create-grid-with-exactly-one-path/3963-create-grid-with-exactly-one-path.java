class Solution {
    public String[] createGrid(int m, int n) {
        String grid[]=new String[m];
        for(int i=0;i<m;i++){
            char[] row=new char[n];
            for(int j=0;j<n;j++){
                row[j]='#';
            }
            grid[i]=new String(row);
        }

        char firstRow[]=grid[0].toCharArray();
        for(int i=0;i<n;i++){
            firstRow[i]='.';
        }
        grid[0]=new String(firstRow);
        for(int i=0;i<m;i++){
            char[] lastRow=grid[i].toCharArray();
            lastRow[n-1]='.';
            grid[i]=new String(lastRow);

        }
        return grid;
       
    }
}