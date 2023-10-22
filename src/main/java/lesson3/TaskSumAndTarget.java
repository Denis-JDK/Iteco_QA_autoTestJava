package lesson3;

public class TaskSumAndTarget {


        //Массив целых чисел и целое число target
        //верните индекс двух чисел так. чтобы они в сумме равнялись target.

        boolean flag = false;

        public int[] numbersIndexSumTarget ( int[] arr, int target){
            int[] array = new int[2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1 + i; i < arr.length; i++) {
                    int res = arr[j] + arr[i];
                    if (res == target) {
                        int resi = i;
                        int resj = j;
                        array = new int[]{resj, resi};
                        System.out.println(resi + "," + resj);
                        flag = true;
                        break;
                    }

                }
                if (flag) ;
                break;
            }
            return array;
        }

    }
