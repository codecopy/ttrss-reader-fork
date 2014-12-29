/*
 * ttrss-reader-fork for Android
 * 
 * Copyright (C) 2010 Nils Braden
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 3 as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 */

package org.ttrssreader.model.pojos;

public class Label implements Comparable<Label> {
    
    public Integer id;
    public String caption;
    public boolean checked;
    public boolean checkedChanged = false;
    public String foregroundColor;
    public String backgroundColor;
    
    @Override
    public int compareTo(Label l) {
        return id.compareTo(l.id);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Label) {
            Label other = (Label) o;
            return (id == other.id);
        } else {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        return id + "".hashCode();
    }
    
    @Override
    public String toString() {
        return caption + ";" + foregroundColor + ";" + backgroundColor;
    }
    
}