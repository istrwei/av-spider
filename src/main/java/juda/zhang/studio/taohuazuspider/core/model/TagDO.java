package juda.zhang.studio.taohuazuspider.core.model;

/**
 * Created by Juda.Zhang on 2017/6/7.
 */
public class TagDO extends BaseDO {
    /**
     * 标签名称，唯一
     */
    private String name;
    /**
     * 标签英文名，唯一
     */
    private String englishName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}