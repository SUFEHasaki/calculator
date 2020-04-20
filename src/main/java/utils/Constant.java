package utils;

public class Constant {
    public static double[][] CURRENCY= {
            /*CNY*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0},
            /*USD*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0},
            /*GBP*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0},
            /*EUR*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0},
            /*KRW*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0},
            /*JPY*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0},
            /*TWD*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0},
            /*MOP*/     {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0}
    };
    public static final double[][] LENGTH= {
            /*微米*/    {1.0, 1e-3, 1e-4,1e-6,1e-9,3.9370079e-5,3.2808399e-6,6.2137119e-10,5.399568e-10},
            /*毫米*/    {1e3,1.0,1e-1,1e-3,1e-6,3.9370079e-2,3.2808399e-3,6.2137119e-7,5.399568e-7},
            /*厘米*/    {1e4,1e1,1.0,1e-2,1e-5,3.9370079e-1,3.2808399e-2,6.2137119e-6,5.399568e-6},
            /*米*/      {1e6,1e3,1e2,1.0,1e-3,3.9370079e1,3.2808399,6.2137119e-4,5.399568e-4},
            /*公里*/    {1e9,1e6,1e5,1e3,1.0,3.9370079e4,3.2808399e3,6.2137119e-1,5.399568e-1},
            /*英寸*/    {2.54e4,2.54e1,2.54,2.54e-2,2.54e-5,1.0,8.3333333e-2,1.5782828e-5,1.37149e-5},
            /*英尺*/    {3.048e5,3.048e2,3.048e1,3.048e-1,3.048e-4,12.0,1.0,1.8939394e-4,1.64579e-4},
            /*英里*/    {1.609344e9,1.609344e6,1.609344e5,1.609344e3,1.609344,6.336e4,5.28e3,1.0,8.688976e-1},
            /*海里*/    {1.852e9,1.852e6,1.852e5,1.852e3,1.852e9,7.291339e4,6.076115e3,1.15078,1.0}
    };
    public static final double[][] MASS= {
            /*克*/      {1.0,2e-3,1e-3,1e-6,3.5274e-2,2.2046e-3,5.0},
            /*斤*/      {5e2,1.0,5e-1,5e-4,1.7636981e1,1.1023113,2.5e3},
            /*千克*/    {1e3,2.0,1.0,1e-3,3.52739619e1,2.2046226,5e3},
            /*公吨*/    {1e6,2e3,1e3,1.0,3.52739619e4,2.2046226e3,5e6},
            /*盎司*/    {2.83495231e1,5.6699e-2,2.83495231e-2,2.83495231e-5,1.0,6.25e-2,1.41447616e2},
            /*磅*/      {4.5359237e2,9.071847e-1,4.5359237e-1,4.5359237e-4,16.0,1.0,2.2679618e3},
            /*克拉*/    {2e-1,4e-4,2e-4,2e-7,7.0548e-3,4.4092e-4,1.0}
    };
    public static final double[][] AREA= {
            /*平方厘米*/ {1.0,1e-4,1e-8,1e-10,1.55e-1,1.07639e-3,1.5e-7},
            /*平方米*/   {1e4,1.0,1e-4,1e-6,1.55e3,1.07639e1,1.5e-3},
            /*公顷*/     {1e8,1e4,1.0,1e-2,1.55e7,1.07639e5,1.5e1},
            /*平方公里*/ {1e10,1e6,1e2,1.0,1.55e9,1.07639e7,1.5e3},
            /*平方英寸*/ {6.4516,6.4516e-4,6.4516e-8,6.4516e-10,1.0,6.94444e3,9.7e-7},
            /*平方英尺*/ {9.290304e2,9.290304e-2,9.290304e-6,9.290304e-8,144.0,1.0,1.3935e-4},
            /*市亩*/     {6.666667e6,6.666667e2,6.666667e-2,6.666667e-4,1.033335e6,7.17594e3,1.0}
    };
    public static final double[][] SPEED= {
            /*米/秒*/    {1.0,3.6,2.236936,1.943844},
            /*公里/小时*/{2.777778e-1,1.0,6.213712e-1,5.399568e-1},
            /*英里/小时(迈)*/{4.4704e-1,1.609344e-1,1.0,8.689762e-1},
            /*节*/       {5.14444e-1,1.852,1.150779,1.0}
    };
}
