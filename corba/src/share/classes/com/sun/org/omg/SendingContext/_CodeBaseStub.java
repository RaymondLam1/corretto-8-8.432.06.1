/*
 * Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.sun.org.omg.SendingContext;


/**
* com/sun/org/omg/SendingContext/_CodeBaseStub.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from rt.idl
* Thursday, May 6, 1999 1:52:08 AM PDT
*/

public class _CodeBaseStub extends org.omg.CORBA.portable.ObjectImpl implements com.sun.org.omg.SendingContext.CodeBase
{
    // Constructors
    // NOTE:  If the default constructor is used, the
    //        object is useless until _set_delegate (...)
    //        is called.
    public _CodeBaseStub ()
    {
        super ();
    }

    public _CodeBaseStub (org.omg.CORBA.portable.Delegate delegate)
    {
        super ();
        _set_delegate (delegate);
    }


    // Operation to obtain the IR from the sending context
    public com.sun.org.omg.CORBA.Repository get_ir ()
    {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request ("get_ir", true);
            _in = _invoke (_out);
            com.sun.org.omg.CORBA.Repository __result = com.sun.org.omg.CORBA.RepositoryHelper.read (_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream ();
            String _id = _ex.getId ();
            throw new org.omg.CORBA.MARSHAL (_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return get_ir ();
        } finally {
            _releaseReply (_in);
        }
    } // get_ir


    // Operations to obtain a URL to the implementation code
    public String implementation (String x)
    {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request ("implementation", true);
            com.sun.org.omg.CORBA.RepositoryIdHelper.write (_out, x);
            _in = _invoke (_out);
            String __result = com.sun.org.omg.SendingContext.CodeBasePackage.URLHelper.read (_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream ();
            String _id = _ex.getId ();
            throw new org.omg.CORBA.MARSHAL (_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return implementation (x);
        } finally {
            _releaseReply (_in);
        }
    } // implementation

    public String[] implementations (String[] x)
    {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request ("implementations", true);
            com.sun.org.omg.CORBA.RepositoryIdSeqHelper.write (_out, x);
            _in = _invoke (_out);
            String __result[] = com.sun.org.omg.SendingContext.CodeBasePackage.URLSeqHelper.read (_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream ();
            String _id = _ex.getId ();
            throw new org.omg.CORBA.MARSHAL (_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return implementations (x);
        } finally {
            _releaseReply (_in);
        }
    } // implementations


    // the same information
    public com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescription meta (String x)
    {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request ("meta", true);
            com.sun.org.omg.CORBA.RepositoryIdHelper.write (_out, x);
            _in = _invoke (_out);
            com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescription __result = com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.read (_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream ();
            String _id = _ex.getId ();
            throw new org.omg.CORBA.MARSHAL (_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return meta (x);
        } finally {
            _releaseReply (_in);
        }
    } // meta

    public com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescription[] metas (String[] x)
    {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request ("metas", true);
            com.sun.org.omg.CORBA.RepositoryIdSeqHelper.write (_out, x);
            _in = _invoke (_out);
            com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescription __result[] = com.sun.org.omg.SendingContext.CodeBasePackage.ValueDescSeqHelper.read (_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream ();
            String _id = _ex.getId ();
            throw new org.omg.CORBA.MARSHAL (_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return metas (x);
        } finally {
            _releaseReply (_in);
        }
    } // metas


    // information
    public String[] bases (String x)
    {
        org.omg.CORBA.portable.InputStream _in = null;
        try {
            org.omg.CORBA.portable.OutputStream _out = _request ("bases", true);
            com.sun.org.omg.CORBA.RepositoryIdHelper.write (_out, x);
            _in = _invoke (_out);
            String __result[] = com.sun.org.omg.CORBA.RepositoryIdSeqHelper.read (_in);
            return __result;
        } catch (org.omg.CORBA.portable.ApplicationException _ex) {
            _in = _ex.getInputStream ();
            String _id = _ex.getId ();
            throw new org.omg.CORBA.MARSHAL (_id);
        } catch (org.omg.CORBA.portable.RemarshalException _rm) {
            return bases (x);
        } finally {
            _releaseReply (_in);
        }
    } // bases

    // Type-specific CORBA::Object operations
    private static String[] __ids = {
        "IDL:omg.org/SendingContext/CodeBase:1.0",
        "IDL:omg.org/SendingContext/RunTime:1.0"};

    public String[] _ids ()
    {
        return (String[])__ids.clone ();
    }

    private void readObject (java.io.ObjectInputStream s)
    {
        try
            {
                String str = s.readUTF ();
                org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init ().string_to_object (str);
                org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
                _set_delegate (delegate);
            } catch (java.io.IOException e) {}
    }

    private void writeObject (java.io.ObjectOutputStream s)
    {
        try
            {
                String str = org.omg.CORBA.ORB.init ().object_to_string (this);
                s.writeUTF (str);
            } catch (java.io.IOException e) {}
    }
} // class _CodeBaseStub