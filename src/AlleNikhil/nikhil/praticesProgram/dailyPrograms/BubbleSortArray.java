package AlleNikhil.nikhil.praticesProgram.dailyPrograms;

public class BubbleSortArray {
    public static void main(String[] args) {
        int [] no={23,45,65,34,8};
        int temp;
        for (int i=0;i<no.length;i++)
        {

            for (int k=0;k<no.length-1;k++){

                if(no[k]>no[k+1]){

                    temp=no[k];  // temp can store no of (k)th index

                    no[k]=no[k+1]; // no of (k)th index can store no of (k+1)th index

                    no[k+1]=temp;  // no of (k+1)th index can store temp

                }

            }
        }
        System.out.println("Total Length of Array is  "+no.length);
        System.out.println("Sorted Element is :");
        for (int l=0;l<=no.length;l++)
            System.out.println(no[l]);

    }
}
