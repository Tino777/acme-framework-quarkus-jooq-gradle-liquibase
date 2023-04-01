/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.testshop.tables.dtos;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import org.acme.generated.AbstractDTO;
import org.acme.generated.testshop.tables.interfaces.ILang;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Valid
public class Lang extends AbstractDTO implements ILang {

    private static final long serialVersionUID = 1L;

    private Integer langId;
    private String  code;
    private String  description;

    public Lang() {}

    public Lang(ILang value) {
        this.langId = value.getLangId();
        this.code = value.getCode();
        this.description = value.getDescription();
    }

    public Lang(
        Integer langId,
        String  code,
        String  description
    ) {
        this.langId = langId;
        this.code = code;
        this.description = description;
    }

    /**
     * Getter for <code>testshop.lang.langId</code>.
     */
    @Override
    public Integer getLangId() {
        return this.langId;
    }

    /**
     * Setter for <code>testshop.lang.langId</code>.
     */
    @Override
    public void setLangId(Integer langId) {
        this.langId = langId;
        this.setAt("langId", langId);
    }

    /**
     * Getter for <code>testshop.lang.code</code>.
     */
    @NotNull
    @Size(max = 2)
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>testshop.lang.code</code>.
     */
    @Override
    public void setCode(String code) {
        this.code = code;
        this.setAt("code", code);
    }

    /**
     * Getter for <code>testshop.lang.description</code>.
     */
    @Size(max = 50)
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>testshop.lang.description</code>.
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
        this.setAt("description", description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Lang other = (Lang) obj;
        if (this.langId == null) {
            if (other.langId != null)
                return false;
        }
        else if (!this.langId.equals(other.langId))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.langId == null) ? 0 : this.langId.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lang (");

        sb.append(langId);
        sb.append(", ").append(code);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ILang from) {
        setLangId(from.getLangId());
        setCode(from.getCode());
        setDescription(from.getDescription());
    }

    @Override
    public <E extends ILang> E into(E into) {
        into.from(this);
        return into;
    }
}
