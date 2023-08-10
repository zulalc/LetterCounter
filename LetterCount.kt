package com.info.homeworks

class LetterCount {
    fun letterCount(word:String, letter:Char){
        var result = 0

        for(w in word){
            if(w==letter){
                result+=1
            }
        }
    println("Letter counted: $result")
    }
}