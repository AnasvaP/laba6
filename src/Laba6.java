// Polyukhovych Nastya IO-82

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;

public class Laba6 {

    static boolean kk = true;
    static int pp = 0;

    public static double function (Double x1, Double x2, Double x3){
        return 7.2 + 5.5*x1 + 6.3*x2 + 3.1*x3 + 4.6*x1*x1 + 0.2*x2*x2 + 3.2*x3*x3 + 4.3*x1*x2 + 0.9*x1*x3 + 8.0*x2*x3 + 7.0*x1*x2*x3;
    }

    public static void main(String[] args) {
        //while (kk) {
            pp += 1;
            System.out.println("-------------------------------------------------------  " + pp + "   -------------------------------------------------------  ");

            double[][] mainMatrix = {
                    {1, -1,  -1,     -1,     1,  1,  1, -1, 1,      1,      1},
                    {1,  -1,  -1,     1,      1, -1, -1,  1, 1,      1,      1},
                    {1,  -1,   1,     -1,    -1,  1, -1,  1, 1,      1,      1},
                    {1,  -1,   1,     1,     -1, -1,  1, -1, 1,      1,      1},
                    {1,  1,   -1,     -1,    -1, -1,  1,  1, 1,      1,      1},
                    {1,  1,   -1,      1,    -1,  1, -1, -1, 1,      1,      1},
                    {1,  1,    1,      -1,    1, -1, -1, -1, 1,      1,      1},
                    {1,  1,    1,      1,     1,  1,  1,  1, 1,      1,      1},
                    {1, -1.73, 0,      0,     0,  0,  0,  0, 2.9929, 0,      0},
                    {1,  1.73, 0,      0,     0,  0,  0,  0, 2.9929, 0,      0},
                    {1,  0,    -1.73,  0,     0,  0,  0,  0, 0,      2.9929, 0},
                    {1,  0,     1.73,  0,     0,  0,  0,  0, 0,      2.9929, 0},
                    {1,  0,     0,     -1.73, 0,  0,  0,  0, 0,      0,      2.9929},
                    {1,  0,     0,      1.73, 0,  0,  0,  0, 0,      0,      2.9929}
            };

            double[][] CohrenaTable = {
                    {.0, .0, .0, .0, .0, .0, .0, .0, .0, .0},
                    {.9985, .9750, .9392, .9057, .8772, .8534, .8332, .8159, .8010, .7880},
                    {.9669, .8709, .7977, .7457, .7071, .6771, .6530, .6333, .6167, .6025},
                    {.9065, .7679, .6841, .6287, .5892, .5598, .5365, .5175, .5017, .4884},
                    {.8412, .6838, .5981, .5440, .5063, .4783, .4564, .4387, .4241, .4118},
                    {.7808, .6161, .5321, .4803, .4447, .4184, .3980, .3817, .3682, .3568},
                    {.7271, .5612, .4800, .4307, .3974, .3726, .3535, .3384, .3259, .3154},
                    {.6798, .5157, .4377, .3910, .3595, .3362, .3185, .3043, .2926, .2829},
                    {.6385, .4775, .4027, .3584, .3286, .3067, .2901, .2768, .2659, .2568},
                    {.6020, .4450, .3733, .3311, .3029, .2823, .2666, .2541, .2439, .2353},
                    {.5410, .3924, .3264, .2880, .2624, .2439, .2299, .2187, .2098, .2020},
                    {.5410, .3924, .3264, .2880, .2624, .2439, .2299, .2187, .2098, .2020},
                    {.5410, .3924, .3264, .2880, .2624, .2439, .2299, .2187, .2098, .2020},
                    {.4709, .3346, .2758, .2419, .2159, .2034, .1911, .1815, .1736, .1671},
                    {.4709, .3346, .2758, .2419, .2159, .2034, .1911, .1815, .1736, .1671},
                    {.4709, .3346, .2758, .2419, .2159, .2034, .1911, .1815, .1736, .1671},
            };

            double[] StudentaTable = {12.71, 4.303, 3.182, 2.776, 2.571, 2.447, 2.365, 2.306, 2.262,
                    2.228, 2.201, 2.179, 2.160, 2.145, 2.131, 2.12, 2.11, 2.101, 2.093, 2.086,
                    2.08, 2.074, 2.069, 2.064, 2.06, 2.056, 2.052, 2.048, 2.045, 2.042, 1.960
            };

            int x1Min = 10, x2Min = -20, x3Min = 10, x1Max = 50, x2Max = 60, x3Max = 15,
                    xAverageMax = (x1Max + x2Max + x3Max) / 3, xAverageMin = (x1Min + x2Min + x3Min) / 3,
                    yMax = 200 + xAverageMax, yMin = 200 + xAverageMin, N = 14, m = 3, f1 = m - 1, f2 = N, f3 = f1 * f2, n = 14,
                    x01 = (x1Max+x1Min)/2, x02 = (x2Max+x2Min)/2, x03 = (x3Max+x3Min)/2, deltaX1 = x01 - x1Min,
                    deltaX2 = x02 - x2Min, deltaX3 = x03 - x1Min ; ;


            double[][] matrixForX = {
                    {x1Min, x2Min, x3Min, 0, 0, 0, 0, 0, 0, 0},
                    {x1Min, x2Min, x3Max, 0, 0, 0, 0, 0, 0, 0},
                    {x1Min, x2Max, x3Min, 0, 0, 0, 0, 0, 0, 0},
                    {x1Min, x2Max, x3Max, 0, 0, 0, 0, 0, 0, 0},
                    {x1Max, x2Min, x3Min, 0, 0, 0, 0, 0, 0, 0},
                    {x1Max, x2Min, x3Max, 0, 0, 0, 0, 0, 0, 0},
                    {x1Max, x2Max, x3Min, 0, 0, 0, 0, 0, 0, 0},
                    {x1Max, x2Max, x3Max, 0, 0, 0, 0, 0, 0, 0},
                    {-1.73*deltaX1+x01, x02, x03, 0, 0, 0, 0, 0, 0, 0},
                    {1.73*deltaX1+x01, x02, x03, 0, 0, 0, 0, 0, 0, 0},
                    {x01, -1.73*deltaX2+x02, x03, 0, 0, 0, 0, 0, 0, 0},
                    {x01, 1.73*deltaX2+x02, x03, 0, 0, 0, 0, 0, 0, 0},
                    {x01, x02, -1.73*deltaX3+x03, 0, 0, 0, 0, 0, 0, 0},
                    {x01, x02, 1.73*deltaX3+x03, 0, 0, 0, 0, 0, 0, 0}
            };

            //матриця для Х
            for (int i = 0; i < 14; i++) {
                matrixForX[i][3] = matrixForX[i][0] * matrixForX[i][1];
                matrixForX[i][4] = matrixForX[i][0] * matrixForX[i][2];
                matrixForX[i][5] = matrixForX[i][1] * matrixForX[i][2];
                matrixForX[i][6] = matrixForX[i][0] * matrixForX[i][2] * matrixForX[i][1];
                matrixForX[i][7] = Math.pow(matrixForX[i][0], 2);
                matrixForX[i][8] = Math.pow(matrixForX[i][1], 2);
                matrixForX[i][9] = Math.pow(matrixForX[i][2], 2);

            }

            double[][] matrixForY = new double[14][3];
            double averageY1 = 0, averageY2 = 0, averageY3 = 0, averageY4 = 0,
                    averageY5 = 0, averageY6 = 0, averageY7 = 0, averageY8 = 0,
                    averageY9 = 0, averageY10 = 0, averageY11 = 0, averageY12 = 0,
                    averageY13 = 0, averageY14 = 0;

            //матриця для у
            Random random = new Random();
            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < 3; j++) {
                    matrixForY[i][j] = function(matrixForX[i][0],matrixForX[i][1], matrixForX[i][2]) + random.nextInt(10)-5;
                }
            }
            System.out.println("Матриця Х : " + Arrays.deepToString(matrixForX));
            System.out.println("Матриця У : " + Arrays.deepToString(matrixForY));


            int o = 3;
            for (int j = 0; j < o; j++) {
                averageY1 += matrixForY[0][j]/o ;
                averageY2 += matrixForY[1][j]/o ;
                averageY3 += matrixForY[2][j]/o ;
                averageY4 += matrixForY[3][j]/o ;
                averageY5 += matrixForY[4][j]/o ;
                averageY6 += matrixForY[5][j]/o ;
                averageY7 += matrixForY[6][j]/o ;
                averageY8 += matrixForY[7][j]/o ;
                averageY9 += matrixForY[8][j]/o ;
                averageY10 += matrixForY[9][j]/o ;
                averageY11 += matrixForY[10][j]/o ;
                averageY12 += matrixForY[11][j]/o ;
                averageY13 += matrixForY[12][j]/o ;
                averageY14 += matrixForY[13][j]/o ;
            }

            double[] averageYArray = {averageY1, averageY2, averageY3, averageY4,
                    averageY5, averageY6, averageY7, averageY8, averageY9, averageY10, averageY11,
                    averageY12, averageY13, averageY14};

            double my = 0.0, mx1 = 0, mx2 = 0, mx3 = 0, mx4 = 0, mx5 = 0,
                    mx6 = 0, mx7 = 0, mx8 = 0, mx9 = 0, mx10 = 0,
                    a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0, a10 = 0;

            for (int i = 0; i < 14; i++) {
                System.out.printf("Cереднє значення функції відгуку для %d рядка = %f%n ", (i + 1), averageYArray[i]);
                my += averageYArray[i];
            }
            my = my/14;

            for (int i = 0; i < 14; i++) {

                mx1 += matrixForX[i][0] / n;
                mx2 += matrixForX[i][1] / n;
                mx3 += matrixForX[i][2] / n;
                mx4 += matrixForX[i][3] / n;
                mx5 += matrixForX[i][4] / n;
                mx6 += matrixForX[i][5] / n;
                mx7 += matrixForX[i][6] / n;
                mx8 += matrixForX[i][7] / n;
                mx9 += matrixForX[i][8] / n;
                mx10 += matrixForX[i][9] / n;


                a1 += matrixForX[i][0] * averageYArray[i] / n;
                a2 += matrixForX[i][1] * averageYArray[i] / n;
                a3 += matrixForX[i][2] * averageYArray[i] / n;
                a4 += matrixForX[i][3] * averageYArray[i] / n;
                a5 += matrixForX[i][4] * averageYArray[i] / n;
                a6 += matrixForX[i][5] * averageYArray[i] / n;
                a7 += matrixForX[i][6] * averageYArray[i] / n;
                a8 += matrixForX[i][7] * averageYArray[i] / n;
                a9 += matrixForX[i][8] * averageYArray[i] / n;
                a10 += matrixForX[i][9] * averageYArray[i] / n;

            }

            double[] arrForAi = {my, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};
            // матриця для всіх коефіцієнтів а (індекси k ,p)
            double[][] akp = {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            };

            for (int i = 0; i < 14; i++) {
                for (int k = 0; k < 10; k++) {
                    for (int p = 0; p < 10; p++) {
                        akp[k][p] += (matrixForX[i][k] * matrixForX[i][p]) / n;
                    }
                }
            }

            double[][] det = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };


            double[][] b0new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b1new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b2new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b3new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b12new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b13new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b23new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b123new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b11new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b22new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };
            double[][] b33new = {
                    {1, mx1, mx2, mx3, mx3, mx4, mx5, mx6, mx7, 0, 0},
                    {mx1, akp[0][0], akp[1][0], akp[2][0], akp[3][0], akp[4][0], akp[5][0], akp[6][0], akp[7][0], akp[8][0], akp[9][0]},
                    {mx2, akp[0][1], akp[1][1], akp[2][1], akp[3][1], akp[4][1], akp[5][1], akp[6][1], akp[7][1], akp[8][1], akp[9][1]},
                    {mx3, akp[0][2], akp[1][2], akp[2][2], akp[3][2], akp[4][2], akp[5][2], akp[6][2], akp[7][2], akp[8][2], akp[9][2]},
                    {mx4, akp[0][3], akp[1][3], akp[2][3], akp[3][3], akp[4][3], akp[5][3], akp[6][3], akp[7][3], akp[8][3], akp[9][3]},
                    {mx5, akp[0][4], akp[1][4], akp[2][4], akp[3][4], akp[4][4], akp[5][4], akp[6][4], akp[7][4], akp[8][4], akp[9][4]},
                    {mx6, akp[0][5], akp[1][5], akp[2][5], akp[3][5], akp[4][5], akp[5][5], akp[6][5], akp[7][5], akp[8][5], akp[9][5]},
                    {mx7, akp[0][6], akp[1][6], akp[2][6], akp[3][6], akp[4][6], akp[5][6], akp[6][6], akp[7][6], akp[8][6], akp[9][6]},
                    {mx8, akp[0][7], akp[1][7], akp[2][7], akp[3][7], akp[4][7], akp[5][7], akp[6][7], akp[7][7], akp[8][7], akp[9][7]},
                    {mx9, akp[0][8], akp[1][8], akp[2][8], akp[3][8], akp[4][8], akp[5][8], akp[6][8], akp[7][8], akp[8][8], akp[9][8]},
                    {mx10, akp[0][9], akp[1][9], akp[2][9], akp[3][9], akp[4][9], akp[5][9], akp[6][9], akp[7][9], akp[8][9], akp[9][9]}
            };

            for (int i = 0; i < 11; i++) {
                b0new[i][0] = arrForAi[i];
                b1new[i][1] = arrForAi[i];
                b2new[i][2] = arrForAi[i];
                b3new[i][3] = arrForAi[i];
                b12new[i][4] = arrForAi[i];
                b13new[i][5] = arrForAi[i];
                b23new[i][6] = arrForAi[i];
                b123new[i][7] = arrForAi[i];
                b11new[i][8] = arrForAi[i];
                b22new[i][9] = arrForAi[i];
                b33new[i][10] = arrForAi[i];
            }

            DeterminantCalc determinantCalcb0 = new DeterminantCalc(b0new);
            DeterminantCalc determinantCalcb1 = new DeterminantCalc(b1new);
            DeterminantCalc determinantCalcb2 = new DeterminantCalc(b2new);
            DeterminantCalc determinantCalcb3 = new DeterminantCalc(b3new);
            DeterminantCalc determinantCalcb12 = new DeterminantCalc(b12new);
            DeterminantCalc determinantCalcb13 = new DeterminantCalc(b13new);
            DeterminantCalc determinantCalcb23 = new DeterminantCalc(b23new);
            DeterminantCalc determinantCalcb123 = new DeterminantCalc(b123new);
            DeterminantCalc determinantCalcb11 = new DeterminantCalc(b11new);
            DeterminantCalc determinantCalcb22 = new DeterminantCalc(b22new);
            DeterminantCalc determinantCalcb33 = new DeterminantCalc(b33new);
            DeterminantCalc determinantCalcDet = new DeterminantCalc(det);


            BigDecimal detDet = determinantCalcDet.determinant();
            BigDecimal koefB0 = determinantCalcb0.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB1 = determinantCalcb1.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB2 = determinantCalcb2.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB3 = determinantCalcb3.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB12 = determinantCalcb12.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB13 = determinantCalcb13.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB23 = determinantCalcb23.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB123 = determinantCalcb123.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB11 = determinantCalcb11.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB22 = determinantCalcb22.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);
            BigDecimal koefB33 = determinantCalcb33.determinant().divide(detDet, 2, RoundingMode.HALF_EVEN);

            System.out.println();
            System.out.println("Рівняння регресії : " + "Y = " + koefB0 + " + " + koefB1 + "*X1 + " + koefB2
                    + "*X2 + " + koefB3 + "*X3 + " + koefB12 + "*X1*X2 + " + koefB13 + "*X3*X1 + " + koefB23 +
                    "*X3 * X2 + " + koefB123 + "*X3*X2*X1 " + koefB11 + "*X1^2 " + koefB22 + "*X2^2 " + koefB33 + "*X3^2 ");

            for (int i = 0; i < 14; i++) {
                BigDecimal[] koefArray = {koefB0
                        , koefB1.multiply(BigDecimal.valueOf(matrixForX[i][0]))
                        , koefB2.multiply(BigDecimal.valueOf(matrixForX[i][1]))
                        , koefB3.multiply(BigDecimal.valueOf(matrixForX[i][2]))
                        , koefB12.multiply(BigDecimal.valueOf(matrixForX[i][0]).multiply(BigDecimal.valueOf(matrixForX[i][1])))
                        , koefB13.multiply(BigDecimal.valueOf(matrixForX[i][2]).multiply(BigDecimal.valueOf(matrixForX[i][0])))
                        , koefB23.multiply(BigDecimal.valueOf(matrixForX[i][2]).multiply(BigDecimal.valueOf(matrixForX[i][1])))
                        , koefB123.multiply(BigDecimal.valueOf(matrixForX[i][0]).multiply(BigDecimal.valueOf(matrixForX[i][1])).multiply(BigDecimal.valueOf(matrixForX[i][2])))
                        , koefB11.multiply(BigDecimal.valueOf(Math.pow(matrixForX[i][0], 2)))
                        , koefB22.multiply(BigDecimal.valueOf(Math.pow(matrixForX[i][1], 2)))
                        , koefB33.multiply(BigDecimal.valueOf(Math.pow(matrixForX[i][2], 2)))
                };
                BigDecimal sum1 = koefArray[0].add(koefArray[1]).add(koefArray[2]).add(koefArray[3]).add(koefArray[4]).
                        add(koefArray[5]).add(koefArray[6]).add(koefArray[7]).add(koefArray[8]).add(koefArray[9]).add(koefArray[10]);
                System.out.println("Перевірка, значення у" + (i + 1) + " :  " + sum1 );
            }


            /**                    Перевірка однорідності дисперсії за критерієм Кохрена                                          */


        long nnn = System.currentTimeMillis();
            // дисперсія
            double dispersion1 = 0, dispersion2 = 0, dispersion3 = 0, dispersion4 = 0,
                    dispersion5 = 0, dispersion6 = 0, dispersion7 = 0, dispersion8 = 0,
                    dispersion9 = 0, dispersion10 = 0, dispersion11 = 0, dispersion12 = 0,
                    dispersion13 = 0, dispersion14 = 0;
            for (int j = 0; j < 3; j++) {
                dispersion1 += (Math.pow((matrixForY[0][j] - averageY1), 2)) / 3;
                dispersion2 += (Math.pow((matrixForY[1][j] - averageY2), 2)) / 3;
                dispersion3 += (Math.pow((matrixForY[2][j] - averageY3), 2)) / 3;
                dispersion4 += (Math.pow((matrixForY[3][j] - averageY4), 2)) / 3;
                dispersion5 += (Math.pow((matrixForY[4][j] - averageY5), 2)) / 3;
                dispersion6 += (Math.pow((matrixForY[5][j] - averageY6), 2)) / 3;
                dispersion7 += (Math.pow((matrixForY[6][j] - averageY7), 2)) / 3;
                dispersion8 += (Math.pow((matrixForY[7][j] - averageY8), 2)) / 3;
                dispersion9 += (Math.pow((matrixForY[8][j] - averageY9), 2)) / 3;
                dispersion10 += (Math.pow((matrixForY[9][j] - averageY10), 2)) / 3;
                dispersion11 += (Math.pow((matrixForY[10][j] - averageY11), 2)) / 3;
                dispersion12 += (Math.pow((matrixForY[11][j] - averageY12), 2)) / 3;
                dispersion13 += (Math.pow((matrixForY[12][j] - averageY13), 2)) / 3;
                dispersion14 += (Math.pow((matrixForY[13][j] - averageY14), 2)) / 3;
            }

            double[] dispersionArray = {dispersion1, dispersion2, dispersion3, dispersion4, dispersion5, dispersion6, dispersion7,
                    dispersion8, dispersion9, dispersion10, dispersion11, dispersion12, dispersion13, dispersion14};
            System.out.println();
            double sumOfDispersion = 0;
            for (int i = 0; i < 14; i++) {
                System.out.printf("дисперсія %d = %f%n", (i + 1), dispersionArray[i]);
                sumOfDispersion += dispersionArray[i];
            }

            int numberOfY = 3;
            double maxDispersion1 = Math.max(Math.max(Math.max(dispersion1, dispersion2), Math.max(dispersion3, dispersion4)),
                    Math.max(Math.max(dispersion5, dispersion6), Math.max(dispersion7, dispersion8))),
                    maxDispersion2 = Math.max(Math.max(Math.max(dispersion9, dispersion10), Math.max(dispersion11, dispersion12)),
                            Math.max(dispersion13, dispersion14)), maxDispersion = Math.max(maxDispersion1, maxDispersion2);

            double gp = maxDispersion / sumOfDispersion;
            if (gp > CohrenaTable[f2 - 1][f1 - 1]) {

                System.out.println("Gp = " + gp + " >   " + CohrenaTable[f2 - 1][f1 - 1]);
                System.out.println();
                System.out.println("Збільшимо кількість дослідів і повторимо перевірку");
                numberOfY += 1;
                int[][] matrixForYNew = new int[14][numberOfY];
                System.out.println("Кількість у = " + numberOfY);

                //матриця для нового у
                for (int i = 0; i < 14; i++) {
                    for (int j = 0; j < numberOfY; j++) {
                        matrixForYNew[i][j] = yMin + (int) (Math.random() * (yMax - yMin));
                    }
                }

                for (int j = 0; j < numberOfY; j++) {
                    averageY1 += matrixForYNew[0][j] / numberOfY;
                    averageY2 += matrixForYNew[1][j] / numberOfY;
                    averageY3 += matrixForYNew[2][j] / numberOfY;
                    averageY4 += matrixForYNew[3][j] / numberOfY;
                    averageY5 += matrixForYNew[4][j] / numberOfY;
                    averageY6 += matrixForYNew[5][j] / numberOfY;
                    averageY7 += matrixForYNew[6][j] / numberOfY;
                    averageY8 += matrixForYNew[7][j] / numberOfY;
                    averageY9 += matrixForYNew[8][j] / numberOfY;
                    averageY10 += matrixForYNew[9][j] / numberOfY;
                    averageY11 += matrixForYNew[10][j] / numberOfY;
                    averageY12 += matrixForYNew[11][j] / numberOfY;
                    averageY13 += matrixForYNew[12][j] / numberOfY;
                    averageY14 += matrixForYNew[13][j] / numberOfY;
                }

                double dispersionNew1 = 0, dispersionNew2 = 0, dispersionNew3 = 0, dispersionNew4 = 0,
                        dispersionNew5 = 0, dispersionNew6 = 0, dispersionNew7 = 0, dispersionNew8 = 0,
                        dispersionNew9 = 0, dispersionNew10 = 0, dispersionNew11 = 0, dispersionNew12 = 0,
                        dispersionNew13 = 0, dispersionNew14 = 0, sumOfDispersionNew = 0;
                for (int j = 0; j < numberOfY; j++) {
                    dispersionNew1 += (Math.pow((matrixForYNew[0][j] - averageY1), 2)) / 4;
                    dispersionNew2 += (Math.pow((matrixForYNew[1][j] - averageY2), 2)) / 4;
                    dispersionNew3 += (Math.pow((matrixForYNew[2][j] - averageY3), 2)) / 4;
                    dispersionNew4 += (Math.pow((matrixForYNew[3][j] - averageY4), 2)) / 4;
                    dispersionNew5 += (Math.pow((matrixForYNew[4][j] - averageY5), 2)) / 4;
                    dispersionNew6 += (Math.pow((matrixForYNew[5][j] - averageY6), 2)) / 4;
                    dispersionNew7 += (Math.pow((matrixForYNew[6][j] - averageY7), 2)) / 4;
                    dispersionNew8 += (Math.pow((matrixForYNew[7][j] - averageY8), 2)) / 4;
                    dispersionNew9 += (Math.pow((matrixForYNew[8][j] - averageY9), 2)) / 4;
                    dispersionNew10 += (Math.pow((matrixForYNew[9][j] - averageY10), 2)) / 4;
                    dispersionNew11 += (Math.pow((matrixForYNew[10][j] - averageY11), 2)) / 4;
                    dispersionNew12 += (Math.pow((matrixForYNew[11][j] - averageY12), 2)) / 4;
                    dispersionNew13 += (Math.pow((matrixForYNew[12][j] - averageY13), 2)) / 4;
                    dispersionNew14 += (Math.pow((matrixForYNew[13][j] - averageY14), 2)) / 4;
                }

                System.out.println();
                double[] newDispersionArray = {dispersionNew1, dispersionNew2, dispersionNew3, dispersionNew4, dispersionNew5, dispersionNew6, dispersionNew7,
                        dispersionNew8, dispersionNew9, dispersionNew10, dispersionNew11, dispersionNew12, dispersionNew13, dispersionNew14};
                for (int i = 0; i < 14; i++) {
                    System.out.printf("нова дисперсія %d = %f%n", (i + 1), newDispersionArray[i]);
                    sumOfDispersionNew += newDispersionArray[i];
                }

                double maxDispersionNew1 = Math.max(Math.max(Math.max(dispersionNew1, dispersionNew2), Math.max(dispersionNew3, dispersionNew4)),
                        Math.max(Math.max(dispersionNew5, dispersionNew6), Math.max(dispersionNew7, dispersionNew8))),
                        maxDispersionNew2 = Math.max(Math.max(Math.max(dispersionNew9, dispersionNew10), Math.max(dispersionNew11, dispersionNew12)),
                                Math.max(dispersionNew13, dispersionNew14)), maxDispersionNew = Math.max(maxDispersionNew1, maxDispersionNew2);
                double gpNew = maxDispersionNew / sumOfDispersionNew;
                System.out.println("GpNew = " + gpNew + " < " + CohrenaTable[f2 - 2][f1 - 1]);
                System.out.println("Дисперсія однорідна (Перевірено за критерієм Кохрена)");
            } else {
                System.out.println();
                System.out.println("Gp = " + gp + " < " + CohrenaTable[f2 - 1][f1 - 1]);
                System.out.println("Дисперсія однорідна (Перевірено за критерієм Кохрена)");
            }


        System.out.println("ЧАС РОБОТИ ПРОГРАМИ: КРИТЕРІЙ КОХРЕНА (МІЛІСЕКУНДИ) =   "+(double) (System.currentTimeMillis() - nnn));

        /**                   Далі оцінимо значимість коефіцієнтів регресії згідно критерію Стьюдента                                         */
            /**                                              Критерій Фішера                                             */


            long mmm = System.currentTimeMillis();
            double sb = sumOfDispersion / N,
                    t = StudentaTable[f3 - 1],
                    sBetta = Math.sqrt(sb / (N * m)), betta0 = 0, betta1 = 0, betta2 = 0, betta3 = 0, betta4 = 0, betta5 = 0, betta6 = 0, betta7 = 0,
                    betta8 = 0, betta9 = 0, betta10 = 0;


            for (int i = 0; i < 14; i++) {
                betta0 += averageYArray[i] * mainMatrix[i][0];
                betta1 += averageYArray[i] * mainMatrix[i][1];
                betta2 += averageYArray[i] * mainMatrix[i][2];
                betta3 += averageYArray[i] * mainMatrix[i][3];
                betta4 += averageYArray[i] * mainMatrix[i][4];
                betta5 += averageYArray[i] * mainMatrix[i][5];
                betta6 += averageYArray[i] * mainMatrix[i][6];
                betta7 += averageYArray[i] * mainMatrix[i][7];
                betta8 += averageYArray[i] * mainMatrix[i][8];
                betta9 += averageYArray[i] * mainMatrix[i][9];
                betta10 += averageYArray[i] * mainMatrix[i][10];
            }
            double
                    t0 = Math.abs(betta0 / N) / sBetta,
                    t1 = Math.abs(betta1 / N) / sBetta,
                    t2 = Math.abs(betta2 / N) / sBetta,
                    t3 = Math.abs(betta3 / N) / sBetta,
                    t4 = Math.abs(betta4 / N) / sBetta,
                    t5 = Math.abs(betta5 / N) / sBetta,
                    t6 = Math.abs(betta6 / N) / sBetta,
                    t7 = Math.abs(betta7 / N) / sBetta,
                    t8 = Math.abs(betta8 / N) / sBetta,
                    t9 = Math.abs(betta9 / N) / sBetta,
                    t10 = Math.abs(betta10 / N) / sBetta;

            int d = 0;
            double[] tArr = {t0, t1, t2, t3, t4, t5, t6, t7, t8, t9,t10};
            boolean[] bArrBoolean = {false, false, false, false, false, false, false, false, false, false,false};
            for (int i = 0; i < 11; i++) {
                if (tArr[i] < t) {
                    System.out.printf("Із перевірки виходить , що коефіцієнт %d незначимий  : %f < %f%n", (i + 1), tArr[i], t);
                    bArrBoolean[i] = false;
                } else {
                    System.out.printf("Із перевірки виходить , що коефіцієнт %d значимий  : %f > %f%n", (i + 1), tArr[i], t);
                    bArrBoolean[i] = true;
                    d += 1;
                }
            }

            System.out.println("d= " + d);
            int f4 = N - d;
            double sum = 0;
            if (f4 == 0) {
                System.out.println("Неможливо порахувати критерій Фішера , оскільки f4 = 0 ");
            } else {

                if (d == N) {
                    System.out.println("Рівняння регресії залишається без змін");
                } else {
                    System.out.println();
                    System.out.println("Нове рівняння регресії , ");
                    double[] testArray = new double[14];
                    double[] qArray = new double[11];

                    for (int i = 0; i < 11; i++) {
                        String[] qArrayString = {"b0", "b1", "b2", "b3", "b12", "b13", "b23", "b123", "b11", "b22", "b33"};
                        if (bArrBoolean[i]) {
                            System.out.println("залишається коефіцієнт : " + qArrayString[i]);
                            for (int j = 0; j < 14; j++) {
                                qArray[0] = koefB0.doubleValue();
                                qArray[1] = koefB1.doubleValue() * matrixForX[j][0];
                                qArray[2] = koefB2.doubleValue() * matrixForX[j][1];
                                qArray[3] = koefB3.doubleValue() * matrixForX[j][2];
                                qArray[4] = koefB12.doubleValue() * matrixForX[j][0] * matrixForX[j][1];
                                qArray[5] = koefB13.doubleValue() * matrixForX[j][2] * matrixForX[j][0];
                                qArray[6] = koefB23.doubleValue() * matrixForX[j][2] * matrixForX[j][1];
                                qArray[7] = koefB123.doubleValue() * matrixForX[j][1] * matrixForX[j][0] * matrixForX[j][2];
                                qArray[8] = koefB11.doubleValue() * Math.pow(matrixForX[j][0], 2);
                                qArray[9] = koefB22.doubleValue() * Math.pow(matrixForX[j][1], 2);
                                qArray[10] = koefB33.doubleValue() * Math.pow(matrixForX[j][2], 2);
                                testArray[j] += qArray[i];
                            }
                        }
                    }

                    System.out.println();
                    sum = 0;
                    for (int i = 0; i < 14; i++) {
                        System.out.println("Перевірка, у" + (i + 1) + " : " + testArray[i]);
                        sum += Math.pow((averageYArray[i] - testArray[i]), 2);
                    }
                }
            }
            FisheraMethod(sum, d, sb, f3, f4, N);
        System.out.println("ЧАС РОБОТИ ПРОГРАМИ: КРИТЕРІЙ СТЬЮДЕНТА (МІЛІСЕКУНДИ) =   "+(double) (System.currentTimeMillis() - mmm));
        }
   // }



    public static void FisheraMethod(double sum, int d, double sb, int f3, int f4, int N) {
        long mmm = System.currentTimeMillis();

        double[][] FisheraTable = {
                {164.4, 199.5, 215.7, 224.6, 230.2, 234, 244.9, 249.0, 254.3},
                {18.5, 19.2, 19.2, 19.3, 19.3, 19.3, 19.4, 19.4, 19.5},
                {10.1, 9.6, 9.3, 9.1, 9, 8.9, 8.7, 8.6, 8.5},
                {7.7, 6.9, 6.6, 6.4, 6.3, 6.2, 5.9, 5.8, 5.6},
                {6.6, 5.8, 5.4, 5.2, 5.1, 5, 4.7, 4.5, 4.4},
                {6, 5.1, 4.8, 4.5, 4.4, 4.3, 4, 3.8, 3.7},
                {5.5, 4.7, 4.4, 4.1, 4, 3.9, 3.6, 3.4, 3.2},
                {5.3, 4.5, 4.1, 3.8, 3.7, 3.6, 3.3, 3.1, 2.9},
                {5.1, 4.3, 3.9, 3.6, 3.5, 3.4, 3.1, 2.9, 2.7},
                {5, 4.1, 3.7, 3.5, 3.3, 3.2, 2.9, 2.7, 2.5},
                {4.8, 4, 3.6, 3.4, 3.2, 3.1, 2.8, 2.6, 2.4},
                {4.8, 3.9, 3.5, 3.3, 3.1, 3, 2.7, 2.5, 2.3},
                {4.7, 3.8, 3.4, 3.2, 3, 2.9, 2.6, 2.4, 2.2},
                {4.6, 3.7, 3.3, 3.1, 3, 2.9, 2.5, 2.3, 2.1},
                {4.5, 3.7, 3.3, 3.1, 2.9, 2.8, 2.5, 2.3, 2.1},
                {4.5, 3.6, 3.2, 3, 2.9, 2.7, 2.4, 2.2, 2},
                {4.5, 3.6, 3.2, 3, 2.8, 2.7, 2.4, 2.2, 2},
                {4.4, 3.6, 3.2, 2.9, 2.8, 2.7, 2.3, 2.1, 1.9},
                {4.4, 3.5, 3.1, 2.9, 2.7, 2.6, 2.3, 2.1, 1.9},
                {4.4, 3.5, 3.1, 2.9, 2.7, 2.6, 2.3, 2.1, 1.9},
                {4.3512, 3.4928, 3.0984, 2.8661, 2.7109, 2.5990, 2.5140, 2.4471, 1.8},
                {4.3248, 3.4668, 3.0725, 2.8401, 2.6848, 2.5727, 2.4876, 2.4205, 1.8},
                {4.3009, 3.4434, 3.0491, 2.8167, 2.6613, 2.5491, 2.4638, 2.3965, 1.7},
                {4.2793, 3.4221, 3.0280, 2.7955, 2.6400, 2.7763, 2.6207, 2.5082, 1.7},
                {4.2597, 3.4028, 3.0088, 2.7763, 2.6207, 2.5082, 2.4226, 2.3551, 1.7},
                {4.2417, 3.3852, 2.9912, 2.7587, 2.6030, 2.4904, 2.4047, 2.3371, 1.7},
                {4.2252, 3.3690, 2.9752, 2.7426, 2.5868, 2.4741, 2.3883, 2.3205, 1.7},
                {4.2100, 3.3541, 2.9604, 2.7278, 2.5719, 2.4591, 2.3732, 2.3053, 1.7},
                {4.1960, 3.3404, 2.9467, 2.7141, 2.5581, 2.4453, 2.3593, 2.2913, 1.6},
                {4.1830, 3.3277, 2.9340, 2.7014, 2.5454, 2.4324, 2.3463, 2.2783, 1.6},
                {4.1709, 3.3158, 2.9223, 2.6896, 2.5336, 2.4205, 2.3343, 2.2662, 1.5},
                {3.8, 3.0, 2.6, 2.4, 2.2, 2.1, 1.8, 1.5, 1},
        };

        double sAD = sum * 3 / (N - d);
        double fP = sAD / sb;

        // константи використовуються для перевірки : чи не вийде значення f3-1 та f4-1 за межі таблиці,
        // щоб у такому разі присвоїти значення при нескінченності (останній рядок та стовпчик таблиці)


        int constLastRow = 30;
        int constLastColumn = 8;
        //System.out.println(fP);
        if ((f3 -1  < constLastRow) && ( f4-1 < constLastColumn) ){
            if (fP < FisheraTable[f3 - 1][f4 - 1]) {
                System.out.println("Перевірка за критерієм Фішера");
                System.out.println("Отже, рівняння регресії адекватно оригіналу при рівні значимості 0.05");
                kk = false;
            } else {
                System.out.println("Отже, рівняння регресії неадекватно оригіналу при рівні значимості 0.05");
            }
            System.out.println();
        }
        else if ((f3 -1  > constLastRow) && ( f4-1 < constLastColumn) ){
            if (fP < FisheraTable[constLastRow][f4-1]){
                System.out.println("Перевірка за критерієм Фішера");
                System.out.println("Отже, рівняння регресії адекватно оригіналу при рівні значимості 0.05");
                kk = false;

            }
            else {
                System.out.println("Отже, рівняння регресії неадекватно оригіналу при рівні значимості 0.05");
            }
            System.out.println();
        }
        else if ((f3 -1  < constLastRow) && ( f4-1 > constLastColumn) ){
            if (fP < FisheraTable[f3-1][constLastColumn]){
                System.out.println("Перевірка за критерієм Фішера");
                System.out.println("Отже, рівняння регресії адекватно оригіналу при рівні значимості 0.05");
                kk = false;
            }
            else {
                System.out.println("Отже, рівняння регресії неадекватно оригіналу при рівні значимості 0.05");
            }
            System.out.println();
        }
        else if ((f3 -1  > constLastRow) && ( f4-1 > constLastColumn) ){
            if (fP < FisheraTable[constLastRow][constLastColumn]){
                System.out.println("Перевірка за критерієм Фішера");
                System.out.println("Отже, рівняння регресії адекватно оригіналу при рівні значимості 0.05");
                kk = false;
            }
            else {
                System.out.println("Отже, рівняння регресії неадекватно оригіналу при рівні значимості 0.05");
            }
            System.out.println();
        }
        System.out.println("ЧАС РОБОТИ ПРОГРАМИ: КРИТЕРІЙ ФІШЕРА (МІЛІСЕКУНДИ) =   "+(double) (System.currentTimeMillis() - mmm));

    }
}


