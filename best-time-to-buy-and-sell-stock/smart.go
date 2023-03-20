func maxProfit(prices []int) int {
  ref := prices[0]
  var diff int
  
  for _, price := range prices {
    if price < ref {
      ref = price
    }
    
    if price - ref > diff {
      diff = price - ref
    }
  }
  
  return diff
}
