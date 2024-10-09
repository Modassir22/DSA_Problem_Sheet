
public class BuyAndSellStock {

    //function that print the profit by analysing buying price and selling price
    public static int buyAndSellStock(int price[]){
    
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
    
        for(int i=0 ; i<price.length ; i++){
            if(buyPrice < price[i]){ //here price = sell price
              int profit = price[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit , profit);
            }else{
                buyPrice = price[i];  // here price = sell price
            }
        }
        return maxProfit;
    }
    
        public static void main(String args[]){
            int price[] = {7,1,5,3,6,4};
            System.out.println(buyAndSellStock(price));
        }
        
    }
    
