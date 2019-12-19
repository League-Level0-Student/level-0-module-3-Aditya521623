void setup(){
  size(500,500);
  
}


void draw(){
  

for(int size = 250;size>=50; size = size-50 ){
  if(size%100>0){
    fill(#030000);
    
  }
  else if(size%100==0){
  fill(#FF0303);
 
  }
  
  ellipse(250,250,size, size);
  
  }
  
   

 


}
