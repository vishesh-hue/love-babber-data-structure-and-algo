pair<int,int> maxMin1(int arr[], int size){
    int max=INT_MIN;
    int min=INT_MAX;
    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return make_pair(max,min);
