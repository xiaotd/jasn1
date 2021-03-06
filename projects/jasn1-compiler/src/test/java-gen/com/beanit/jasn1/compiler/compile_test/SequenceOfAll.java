/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.compile_test;

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


public class SequenceOfAll implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	private byte[] code = null;
	public BerInteger myInteger = null;
	public BerInteger myInteger2 = null;
	public BerBoolean myBoolean = null;
	public BerBitString bitString = null;
	public BerEnum enumerated = null;
	public BerGeneralizedTime generalizedTime = null;
	public BerNull myNull = null;
	public BerObjectIdentifier objectIdentifier = null;
	public BerOctetString octetString = null;
	public BerReal real = null;
	public IntegerWithValues testIntegerWithValues = null;
	public OctetStringWithSize testOctetStringWithSize = null;
	public SequenceWithSize testSequenceWithSize = null;
	public BerTime time = null;
	public BerDate date2 = null;
	public BerTimeOfDay timeOfDay = null;
	public BerDateTime dateTime = null;
	public BerDuration duration = null;
	public BerBMPString bmpString = null;
	public BerGeneralString generalString = null;
	public BerGraphicString graphicString = null;
	public BerIA5String iA5String = null;
	public BerNumericString numericString = null;
	public BerPrintableString printableString = null;
	public BerTeletexString teletexString = null;
	public BerUniversalString universalString = null;
	public BerUTF8String utf8String = null;
	public BerVideotexString videotexString = null;
	public BerVisibleString visibleString = null;
	public BerAny any = null;
	public MySequence mySequence = null;
	public MyChoice myChoice = null;
	
	public SequenceOfAll() {
	}

	public SequenceOfAll(byte[] code) {
		this.code = code;
	}

	public SequenceOfAll(BerInteger myInteger, BerInteger myInteger2, BerBoolean myBoolean, BerBitString bitString, BerEnum enumerated, BerGeneralizedTime generalizedTime, BerNull myNull, BerObjectIdentifier objectIdentifier, BerOctetString octetString, BerReal real, IntegerWithValues testIntegerWithValues, OctetStringWithSize testOctetStringWithSize, SequenceWithSize testSequenceWithSize, BerTime time, BerDate date2, BerTimeOfDay timeOfDay, BerDateTime dateTime, BerDuration duration, BerBMPString bmpString, BerGeneralString generalString, BerGraphicString graphicString, BerIA5String iA5String, BerNumericString numericString, BerPrintableString printableString, BerTeletexString teletexString, BerUniversalString universalString, BerUTF8String utf8String, BerVideotexString videotexString, BerVisibleString visibleString, BerAny any, MySequence mySequence, MyChoice myChoice) {
		this.myInteger = myInteger;
		this.myInteger2 = myInteger2;
		this.myBoolean = myBoolean;
		this.bitString = bitString;
		this.enumerated = enumerated;
		this.generalizedTime = generalizedTime;
		this.myNull = myNull;
		this.objectIdentifier = objectIdentifier;
		this.octetString = octetString;
		this.real = real;
		this.testIntegerWithValues = testIntegerWithValues;
		this.testOctetStringWithSize = testOctetStringWithSize;
		this.testSequenceWithSize = testSequenceWithSize;
		this.time = time;
		this.date2 = date2;
		this.timeOfDay = timeOfDay;
		this.dateTime = dateTime;
		this.duration = duration;
		this.bmpString = bmpString;
		this.generalString = generalString;
		this.graphicString = graphicString;
		this.iA5String = iA5String;
		this.numericString = numericString;
		this.printableString = printableString;
		this.teletexString = teletexString;
		this.universalString = universalString;
		this.utf8String = utf8String;
		this.videotexString = videotexString;
		this.visibleString = visibleString;
		this.any = any;
		this.mySequence = mySequence;
		this.myChoice = myChoice;
	}

	@Override public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			reverseOS.write(code);
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		int sublength;

		codeLength += myChoice.encode(reverseOS);
		
		codeLength += mySequence.encode(reverseOS, true);
		
		sublength = any.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
		reverseOS.write(0xA9);
		codeLength += 1;
		
		codeLength += visibleString.encode(reverseOS, true);
		
		codeLength += videotexString.encode(reverseOS, true);
		
		codeLength += utf8String.encode(reverseOS, true);
		
		codeLength += universalString.encode(reverseOS, true);
		
		codeLength += teletexString.encode(reverseOS, true);
		
		codeLength += printableString.encode(reverseOS, true);
		
		codeLength += numericString.encode(reverseOS, true);
		
		codeLength += iA5String.encode(reverseOS, true);
		
		codeLength += graphicString.encode(reverseOS, true);
		
		codeLength += generalString.encode(reverseOS, true);
		
		codeLength += bmpString.encode(reverseOS, true);
		
		codeLength += duration.encode(reverseOS, true);
		
		codeLength += dateTime.encode(reverseOS, true);
		
		codeLength += timeOfDay.encode(reverseOS, true);
		
		codeLength += date2.encode(reverseOS, true);
		
		codeLength += time.encode(reverseOS, true);
		
		codeLength += testSequenceWithSize.encode(reverseOS, true);
		
		codeLength += testOctetStringWithSize.encode(reverseOS, true);
		
		codeLength += testIntegerWithValues.encode(reverseOS, true);
		
		codeLength += real.encode(reverseOS, true);
		
		codeLength += octetString.encode(reverseOS, true);
		
		codeLength += objectIdentifier.encode(reverseOS, true);
		
		codeLength += myNull.encode(reverseOS, true);
		
		codeLength += generalizedTime.encode(reverseOS, true);
		
		codeLength += enumerated.encode(reverseOS, true);
		
		codeLength += bitString.encode(reverseOS, true);
		
		codeLength += myBoolean.encode(reverseOS, true);
		
		codeLength += myInteger2.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 31
		reverseOS.write(0x1F);
		reverseOS.write(0x9F);
		codeLength += 2;
		
		if (myInteger != null) {
			codeLength += myInteger.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 30
			reverseOS.write(0x9E);
			codeLength += 1;
		}
		
		codeLength += BerLength.encodeLength(reverseOS, codeLength);

		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;

	}

	@Override public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int tlByteCount = 0;
		int vByteCount = 0;
		int numDecodedBytes;
		BerTag berTag = new BerTag();

		if (withTag) {
			tlByteCount += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		tlByteCount += length.decode(is);
		int lengthVal = length.val;
		vByteCount += berTag.decode(is);

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 30)) {
			myInteger = new BerInteger();
			vByteCount += myInteger.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 31)) {
			myInteger2 = new BerInteger();
			vByteCount += myInteger2.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerBoolean.tag)) {
			myBoolean = new BerBoolean();
			vByteCount += myBoolean.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerBitString.tag)) {
			bitString = new BerBitString();
			vByteCount += bitString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerEnum.tag)) {
			enumerated = new BerEnum();
			vByteCount += enumerated.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerGeneralizedTime.tag)) {
			generalizedTime = new BerGeneralizedTime();
			vByteCount += generalizedTime.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerNull.tag)) {
			myNull = new BerNull();
			vByteCount += myNull.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerObjectIdentifier.tag)) {
			objectIdentifier = new BerObjectIdentifier();
			vByteCount += objectIdentifier.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerOctetString.tag)) {
			octetString = new BerOctetString();
			vByteCount += octetString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerReal.tag)) {
			real = new BerReal();
			vByteCount += real.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(IntegerWithValues.tag)) {
			testIntegerWithValues = new IntegerWithValues();
			vByteCount += testIntegerWithValues.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(OctetStringWithSize.tag)) {
			testOctetStringWithSize = new OctetStringWithSize();
			vByteCount += testOctetStringWithSize.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(SequenceWithSize.tag)) {
			testSequenceWithSize = new SequenceWithSize();
			vByteCount += testSequenceWithSize.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerTime.tag)) {
			time = new BerTime();
			vByteCount += time.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerDate.tag)) {
			date2 = new BerDate();
			vByteCount += date2.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerTimeOfDay.tag)) {
			timeOfDay = new BerTimeOfDay();
			vByteCount += timeOfDay.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerDateTime.tag)) {
			dateTime = new BerDateTime();
			vByteCount += dateTime.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerDuration.tag)) {
			duration = new BerDuration();
			vByteCount += duration.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerBMPString.tag)) {
			bmpString = new BerBMPString();
			vByteCount += bmpString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerGeneralString.tag)) {
			generalString = new BerGeneralString();
			vByteCount += generalString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerGraphicString.tag)) {
			graphicString = new BerGraphicString();
			vByteCount += graphicString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerIA5String.tag)) {
			iA5String = new BerIA5String();
			vByteCount += iA5String.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerNumericString.tag)) {
			numericString = new BerNumericString();
			vByteCount += numericString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerPrintableString.tag)) {
			printableString = new BerPrintableString();
			vByteCount += printableString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerTeletexString.tag)) {
			teletexString = new BerTeletexString();
			vByteCount += teletexString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerUniversalString.tag)) {
			universalString = new BerUniversalString();
			vByteCount += universalString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerUTF8String.tag)) {
			utf8String = new BerUTF8String();
			vByteCount += utf8String.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerVideotexString.tag)) {
			videotexString = new BerVideotexString();
			vByteCount += videotexString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerVisibleString.tag)) {
			visibleString = new BerVisibleString();
			vByteCount += visibleString.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
			vByteCount += length.decode(is);
			any = new BerAny();
			vByteCount += any.decode(is, null);
			vByteCount += length.readEocIfIndefinite(is);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		if (berTag.equals(MySequence.tag)) {
			mySequence = new MySequence();
			vByteCount += mySequence.decode(is, false);
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		
		myChoice = new MyChoice();
		numDecodedBytes = myChoice.decode(is, berTag);
		if (numDecodedBytes != 0) {
			vByteCount += numDecodedBytes;
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match mandatory sequence component.");
		}
		if (lengthVal < 0) {
			if (!berTag.equals(0, 0, 0)) {
				throw new IOException("Decoded sequence has wrong end of contents octets");
			}
			vByteCount += BerLength.readEocByte(is);
			return tlByteCount + vByteCount;
		}

		throw new IOException("Unexpected end of sequence, length tag: " + lengthVal + ", bytes decoded: " + vByteCount);

	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		boolean firstSelectedElement = true;
		if (myInteger != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("myInteger: ").append(myInteger);
			firstSelectedElement = false;
		}
		
		if (!firstSelectedElement) {
			sb.append(",\n");
		}
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (myInteger2 != null) {
			sb.append("myInteger2: ").append(myInteger2);
		}
		else {
			sb.append("myInteger2: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (myBoolean != null) {
			sb.append("myBoolean: ").append(myBoolean);
		}
		else {
			sb.append("myBoolean: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (bitString != null) {
			sb.append("bitString: ").append(bitString);
		}
		else {
			sb.append("bitString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (enumerated != null) {
			sb.append("enumerated: ").append(enumerated);
		}
		else {
			sb.append("enumerated: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (generalizedTime != null) {
			sb.append("generalizedTime: ").append(generalizedTime);
		}
		else {
			sb.append("generalizedTime: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (myNull != null) {
			sb.append("myNull: ").append(myNull);
		}
		else {
			sb.append("myNull: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (objectIdentifier != null) {
			sb.append("objectIdentifier: ").append(objectIdentifier);
		}
		else {
			sb.append("objectIdentifier: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (octetString != null) {
			sb.append("octetString: ").append(octetString);
		}
		else {
			sb.append("octetString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (real != null) {
			sb.append("real: ").append(real);
		}
		else {
			sb.append("real: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (testIntegerWithValues != null) {
			sb.append("testIntegerWithValues: ").append(testIntegerWithValues);
		}
		else {
			sb.append("testIntegerWithValues: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (testOctetStringWithSize != null) {
			sb.append("testOctetStringWithSize: ").append(testOctetStringWithSize);
		}
		else {
			sb.append("testOctetStringWithSize: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (testSequenceWithSize != null) {
			sb.append("testSequenceWithSize: ");
			testSequenceWithSize.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("testSequenceWithSize: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (time != null) {
			sb.append("time: ").append(time);
		}
		else {
			sb.append("time: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (date2 != null) {
			sb.append("date2: ").append(date2);
		}
		else {
			sb.append("date2: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (timeOfDay != null) {
			sb.append("timeOfDay: ").append(timeOfDay);
		}
		else {
			sb.append("timeOfDay: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (dateTime != null) {
			sb.append("dateTime: ").append(dateTime);
		}
		else {
			sb.append("dateTime: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (duration != null) {
			sb.append("duration: ").append(duration);
		}
		else {
			sb.append("duration: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (bmpString != null) {
			sb.append("bmpString: ").append(bmpString);
		}
		else {
			sb.append("bmpString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (generalString != null) {
			sb.append("generalString: ").append(generalString);
		}
		else {
			sb.append("generalString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (graphicString != null) {
			sb.append("graphicString: ").append(graphicString);
		}
		else {
			sb.append("graphicString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (iA5String != null) {
			sb.append("iA5String: ").append(iA5String);
		}
		else {
			sb.append("iA5String: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (numericString != null) {
			sb.append("numericString: ").append(numericString);
		}
		else {
			sb.append("numericString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (printableString != null) {
			sb.append("printableString: ").append(printableString);
		}
		else {
			sb.append("printableString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (teletexString != null) {
			sb.append("teletexString: ").append(teletexString);
		}
		else {
			sb.append("teletexString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (universalString != null) {
			sb.append("universalString: ").append(universalString);
		}
		else {
			sb.append("universalString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (utf8String != null) {
			sb.append("utf8String: ").append(utf8String);
		}
		else {
			sb.append("utf8String: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (videotexString != null) {
			sb.append("videotexString: ").append(videotexString);
		}
		else {
			sb.append("videotexString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (visibleString != null) {
			sb.append("visibleString: ").append(visibleString);
		}
		else {
			sb.append("visibleString: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (any != null) {
			sb.append("any: ").append(any);
		}
		else {
			sb.append("any: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (mySequence != null) {
			sb.append("mySequence: ");
			mySequence.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("mySequence: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (myChoice != null) {
			sb.append("myChoice: ");
			myChoice.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("myChoice: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

