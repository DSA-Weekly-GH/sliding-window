object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    val n = s.length
    var maxLen = 0
    var start = 0
    var end = 0
    var seen = Set[Char]()

    while (end < n) {
      val c = s.charAt(end)
      if (!seen.contains(c)) {
        seen += c
        end += 1
        maxLen = math.max(maxLen, end - start)
      } else {
        seen -= s.charAt(start)
        start += 1
      }
    }
    maxLen
  }
}
