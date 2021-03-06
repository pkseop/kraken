// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Ice;

// <auto-generated>
//
// Generated from file `LocalException.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * This exception is raised if there was an error while parsing an
 * endpoint selection type.
 * 
 **/
public class EndpointSelectionTypeParseException extends Ice.LocalException
{
    public EndpointSelectionTypeParseException()
    {
    }

    public EndpointSelectionTypeParseException(String str)
    {
        this.str = str;
    }

    public String
    ice_name()
    {
        return "Ice::EndpointSelectionTypeParseException";
    }

    /**
     * The string that could not be parsed.
     * 
     **/
    public String str;
}
