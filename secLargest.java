public class secLargest {
    public static void main(String[] args) {
        int arr[]={1,2 ,4 ,7 ,7 ,5};
        int result=findSecLargest(arr);
        System.out.println(result);
    }
    private static int findSecLargest(int[] arr) {
                int largest=arr[0];
                int slargest=-1;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>largest){
                        slargest=largest;

                        largest=arr[i];
                    }
                    else if ( arr[i] > slargest && arr[i] < largest) {
                        slargest=arr[i];

                    }

                }  return slargest;
            }
        }


