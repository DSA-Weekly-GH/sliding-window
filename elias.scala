object Solution {
  def maxProfit(prices: Array[Int]): Int = {
    if (prices == null || prices.length < 2) return 0

    var left = 0
    var right = 1
    var minPrice = prices(0)
    var maxProfit = 0

    while (right < prices.length) {
      val curPrice = prices(right)
      val curProfit = curPrice - minPrice

      if (curProfit > maxProfit) {
        maxProfit = curProfit
      }

      if (curPrice < minPrice) {
        minPrice = curPrice
      }

      right += 1
    }

    maxProfit
  }

}