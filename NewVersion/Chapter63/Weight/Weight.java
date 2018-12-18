class Weight{
  private int[] data;
  
  public Weight(int[] init){
    data = new int[init.length];

    for (int i = 0; i < init.length; i++){
      data[i] = init[i];
    }
  }

  public int subAverage(int start, int end){
    int subAvg = 0;
    for (int i = start; i <= end; i++){
      subAvg = subAvg + data[i];
    }
    subAvg = subAvg/(end - start + 1);
    return subAvg;
  }

  public int average(){
    int avg = 0;
    for (int i = 0; i < data.length; i++){
      avg = avg + data[i];
    }
    avg = avg/data.length;
    return avg;
  }
  
  public String toString(){
    String str = "Weights: \n";
    for (int i = 0; i < data.length; i++){
      str = str + data[i] + ", ";
    }
    return str;
  }
}