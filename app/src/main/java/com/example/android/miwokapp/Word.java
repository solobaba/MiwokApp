package com.example.android.miwokapp;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and Miwok translation for that words.
 */

public class Word {

    /**Default translation for the word*/
    private String mDefaultTranslation;

    /**Miwok translation for the word*/
    private String mMiwokTranslation;

    /**Audio resource ID for the word*/
    private int mAudioResourceId;

    /** Image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**Constant value that represents no image was provided for this word*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in a English language
     * @param miwokTranslation is the word in Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with the word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in a English language
     * @param miwokTranslation is the word in Miwok language
     * @param imageResourceId is the the image resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation for the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation for the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the Image resource ID for the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the audio resource ID for the word
     */
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
