package com.example.android.mi_rifiuto;

/**
 * The {@link Word} contains the waste name and a description
 */
public class Word {

    /* Private waste name and description and image resource ID associated*/
    private String mWaste;
    private String mDescription;
    private Integer mImageResourceID;

    /**
     * Public constructor to set Miwok and Default translation words
     * @param waste word in Miwok language
     * @param defaultTranslation word in user default language
     */
    public Word(String waste, String defaultTranslation) {
        mWaste = waste;
        mDescription = defaultTranslation;
    }

    /**
     * Public constructor to set Miwok and Default translation and image resource ID
     * @param waste word in Miwok language
     * @param description word in user default language
     * @param imageResourceID Integer of the image resource ID associated
     */
    public Word(String waste, String description, Integer imageResourceID) {
        mWaste = waste;
        mDescription = description;
        mImageResourceID = imageResourceID;
    }

    /**
     * Get the waste name
     * @return waste name as a string
     */
    public String getWaste() {
        return mWaste;
    }

    /**
     * Get the description
     * @return description as a string
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the resource ID of the image associated
     * @return Integer with the target image resource ID
     */
    public Integer getImageResourceID() {
        return mImageResourceID;
    }
}
