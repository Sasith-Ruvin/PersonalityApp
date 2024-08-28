package com.example.personality.Data

import com.example.personality.R
import com.example.personality.model.Personality

class DataSource {
    fun loadPersonality() : List<Personality>{
        return listOf<Personality>(
            Personality(R.string.personality_intj,R.drawable.thumbnail_image016,R.string.desc_intj),
            Personality(R.string.personality_intp,R.drawable.thumbnail_image015,R.string.desc_intp),
            Personality(R.string.personality_intj,R.drawable.thumbnail_image014,R.string.desc_intj),
            Personality(R.string.personality_entp,R.drawable.thumbnail_image013,R.string.desc_entp),
            Personality(R.string.personality_infj,R.drawable.thumbnail_image012,R.string.desc_infj),
            Personality(R.string.personality_infp,R.drawable.thumbnail_image011,R.string.desc_infp),
            Personality(R.string.personality_enfj,R.drawable.thumbnail_image010,R.string.desc_enfj),
            Personality(R.string.personality_enfp,R.drawable.thumbnail_image009,R.string.desc_enfp),
            Personality(R.string.personality_istj,R.drawable.thumbnail_image008,R.string.desc_istj),
            Personality(R.string.personality_isfj,R.drawable.thumbnail_image007,R.string.desc_isfj),
            Personality(R.string.personality_estj,R.drawable.thumbnail_image006,R.string.desc_estj),
            Personality(R.string.personality_esfj,R.drawable.thumbnail_image005,R.string.desc_esfj),
            Personality(R.string.personality_istp,R.drawable.thumbnail_image004,R.string.desc_istp),
            Personality(R.string.personality_isfp,R.drawable.thumbnail_image003,R.string.desc_isfp),
            Personality(R.string.personality_esfp,R.drawable.thumbnail_image001,R.string.desc_esfp)
        )
    }
}