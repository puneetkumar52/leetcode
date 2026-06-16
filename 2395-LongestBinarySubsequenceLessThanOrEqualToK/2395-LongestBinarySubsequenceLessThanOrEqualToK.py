# Last updated: 6/16/2026, 8:51:20 AM
class Solution:
    def longestSubsequence(self, s: str, k: int) -> int:
        current_val = 0
        ans_length = 0
        power = 1

        for i in range(len(s) - 1, -1, -1):
            if s[i] == '0':
                ans_length += 1
            else:
                if current_val + power <= k:
                    current_val += power
                    ans_length += 1
                
            if power <= k: 
                power *= 2
            elif power > k and s[i] == '1' and i > 0: 
                # This condition is crucial: if power is already too large for 'k', 
                # and we encounter a '1', it means we cannot add any more '1's.
                # However, we still need to add any remaining '0's to the length.
                # The 'power' variable should not grow further unnecessarily.
                # But it should grow if it's still possible to reach 'k'.
                # The 'if power <= k' above already handles this.
                # The additional check `and s[i] == '1' and i > 0` is redundant
                # if power just gets multiplied always.
                # Let's simplify and just let power always multiply. Python handles large ints.
                pass
        
        return ans_length