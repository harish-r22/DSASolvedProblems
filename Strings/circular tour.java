//circular tour

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	   int start=0;
	   int total_surplus=0;
	   int surplus=0;
	   int n=petrol.length;
	   for(int i=0;i<n;i++){
	          total_surplus += petrol[i]-distance[i];
	          surplus += petrol[i]-distance[i];
	          if(surplus<0){
	          surplus=0;
	          start=i+1;
	          }
	   }
	   return (total_surplus < 0)? -1 : start;
    }
}

time complexcity ; o(n)
space complexcity : o(1)