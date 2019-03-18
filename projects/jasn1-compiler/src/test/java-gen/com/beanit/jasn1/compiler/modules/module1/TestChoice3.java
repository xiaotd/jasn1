/**
 * This class file was automatically generated by jASN1 v1.11.1-SNAPSHOT (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.modules.module1;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.jasn1.ber.*;
import com.beanit.jasn1.ber.types.*;
import com.beanit.jasn1.ber.types.string.*;

import com.beanit.jasn1.compiler.modules.module2.EmployeeNumberZ;
import com.beanit.jasn1.compiler.modules.module3.Datezz;
import com.beanit.jasn1.compiler.modules.module3.EmployeeNumberzz;

public class TestChoice3 extends TestChoice2 {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11);

	public byte[] code = null;

	public TestChoice3() {
	}

	public TestChoice3(byte[] code) {
		super(code);
	}

	public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength;

		codeLength = super.encode(reverseOS);
		codeLength += BerLength.encodeLength(reverseOS, codeLength);
		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {

		int codeLength = 0;

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		codeLength += super.decode(is, null);

		return codeLength;
	}

}