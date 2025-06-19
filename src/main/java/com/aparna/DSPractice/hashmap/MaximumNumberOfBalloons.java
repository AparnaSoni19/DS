package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String text = "balloon";
        String finalText = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        int maxNumberOfInstance = Integer.MAX_VALUE;
        Map<Character, Integer> textMap = new HashMap<>();
        Map<Character, Integer> finalTextMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            textMap.put(text.charAt(i), textMap.getOrDefault(text.charAt(i), 0) + 1);
        }
        for (int i = 0; i < finalText.length(); i++) {
            finalTextMap.put(finalText.charAt(i), finalTextMap.getOrDefault(finalText.charAt(i), 0) + 1);
        }
        for(char key :textMap.keySet())
        {
            if(!finalTextMap.containsKey(key) || finalTextMap.get(key)<textMap.get(key))
            {
                maxNumberOfInstance=0;
                System.out.println(maxNumberOfInstance);
                break;
            }else {
                maxNumberOfInstance=Math.min(maxNumberOfInstance,finalTextMap.get(key)/textMap.get(key));
            }
        }
        System.out.println("value "+maxNumberOfInstance);

    }
}
