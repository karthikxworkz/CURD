package com.xworkz.StringMethods;

import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.print.PrinterException;
import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.LambdaConversionException;
import java.net.URISyntaxException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.AccountException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

import org.ietf.jgss.GSSException;

import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;

import jdk.internal.org.xml.sax.SAXException;

public class Exceptions {
	
	void Exceptions1(){
		try {
			String phoneNumber="098787666l";
			long c=Long.parseLong(phoneNumber);
			System.out.println("Phone number");
		//	throw new NumberFormatException();
		}
		catch(NumberFormatException exception) {
			System.out.println("Exception ordered");
		}
   }
	
	 void Exception2() {
		 try {
			throw new ActivationException(); 
		 }catch(ActivationException exception) {
			System.out.println("Exception2 ordered"); 
		 }
	 }
	 
	 void Exception3() {
		 try {
			 throw new AlreadyBoundException();
		 } catch(AlreadyBoundException exception) {
			System.out.println("Exception3 ordered"); 
		 }
	 }
	 
	 void Exception4() {
		 try {
			 throw new AccountException();
		 } catch(AccountException exception) {
			System.out.println("Exception4 ordered"); 
		 }
	 }
	 
	 void Exception5() {
		 try {
			 throw new AWTException("");
		 }catch(AWTException exception) {
			 System.out.println("Exception5 ordered");
		 }
	 }
	
	 void Exception6() {
		 try {
			 throw new AWTException("");
		 }catch(AWTException exception) {
			 System.out.println("Exception6 ordered");
		 }
	 }
	
	 void Exception7() {
		 try {
			 throw new BadAttributeValueExpException("");
		 }catch(BadAttributeValueExpException exception) {
			 System.out.println("Exception7 ordered");
		 }
	 }

	 void Exception8() {
		 try {
			 throw new BadBinaryOpValueExpException(null);
		 }catch(BadBinaryOpValueExpException exception) {
			 System.out.println("Exception8 ordered");
		 }
	 }
	
	 void Exception9() {
		 try {
			 throw new BadLocationException(null, 0);
		 }catch(BadLocationException exception) {
			 System.out.println("Exception 9 ordered");
		 }
	 }

	 void Exception10() {
		 try {
			 throw new BadStringOperationException(null);
		 }catch(BadStringOperationException exception) {
			 System.out.println("Exception 10  ordered");
		 }
	 }
	 
	 void Exception11() {
		 try {
			 throw new BrokenBarrierException();
		 }catch(BrokenBarrierException exception) {
			 System.out.println("Exception 11 ordered");
		 }
	 }
	 
	 void Exception12() {
		 try {
			 throw new CertificateException();
		 }catch(CertificateException exception) {
			 System.out.println("Exception 12 ordered");
		 }
	 }
	 
	 void Exception13() {
		 try {
			 throw new CloneNotSupportedException();
		 }catch(CloneNotSupportedException exception) {
			 System.out.println("Exception 13 ordered");
		 }
	 }
	 void Exception14() {
		 try {
			 throw new DataFormatException();
		 }catch(DataFormatException exception) {
			 System.out.println("Exception 14 ordered");
		 }
	 }
	 void Exception15() {
		 try {
			 throw new DatatypeConfigurationException();
		 }catch(DatatypeConfigurationException exception) {
			 System.out.println("Exception 15 ordered");
		 }
	 }
	 void Exception16() {
		 try {
			 throw new DestroyFailedException();
		 }catch(DestroyFailedException exception) {
			 System.out.println("Exception 16 ordered");
		 }
	 }
//	 void Exception17() {
//		 try {
//			 throw new ExecutionException();
//		 }catch(ExecutionException exception) {
//			 System.out.println("Exception 17 ordered");
//		 }
//	 }
	 void Exception18() {
		 try {
			 throw new ExpandVetoException(null, null);
		 }catch(ExpandVetoException exception) {
			 System.out.println("Exception 18 ordered");
		 }
	 }
	 void Exception19() {
		 try {
			 throw new FontFormatException(null);
		 }catch(FontFormatException exception) {
			 System.out.println("Exception 19 ordered");
		 }
	 }
	 void Exception20() {
		 try {
			 throw new GeneralSecurityException();
		 }catch(GeneralSecurityException exception) {
			 System.out.println("Exception 20 ordered");
		 }
	 }
	 void Exception21() {
		 try {
			 throw new GSSException(0);
		 }catch(GSSException exception) {
			 System.out.println("Exception 21 ordered");
		 }
	 }
	 void Exception22() {
		 try {
			 throw new IllegalClassFormatException();
		 }catch(IllegalClassFormatException exception) {
			 System.out.println("Exception 22 ordered");
		 }
	 }
	 void Exception23() {
		 try {
			 throw new InterruptedException();
		 }catch(InterruptedException exception) {
			 System.out.println("Exception 23 ordered");
		 }
	 }
	 void Exception24() {
		 try {
			 throw new IntrospectionException(null);
		 }catch(IntrospectionException exception) {
			 System.out.println("Exception 24 ordered");
		 }
	 }
	 void Exception25() {
		 try {
			 throw new InvalidApplicationException(null);
		 }catch(InvalidApplicationException exception) {
			 System.out.println("Exception 25 ordered");
		 }
	 }
	 void Exception26() {
		 try {
			 throw new InvalidMidiDataException();
		 }catch(InvalidMidiDataException exception) {
			 System.out.println("Exception 26 ordered");
		 }
	 }
	 void Exception27() {
		 try {
			 throw new InvalidPreferencesFormatException(null, null);
		 }catch(InvalidPreferencesFormatException exception) {
			 System.out.println("Exception 27 ordered");
		 }
	 }
	 void Exception28() {
		 try {
			 throw new InvalidTargetObjectTypeException(null);
		 }catch(InvalidTargetObjectTypeException exception) {
			 System.out.println("Exception 28 ordered");
		 }
	 }
	 void Exception29() {
		 try {
			 throw new IOException();
		 }catch(IOException exception) {
			 System.out.println("Exception 29 ordered");
		 }
	 }
	 void Exception30() {
		 try {
			 throw new JMException();
		 }catch(JMException exception) {
			 System.out.println("Exception 30 ordered");
		 }
	 }
	 void Exception31() {
		 try {
			 throw new KeySelectorException();
		 }catch(KeySelectorException exception) {
			 System.out.println("Exception 31 ordered");
		 }
	 }
	 void Exception32() {
		 try {
			 throw new KeySelectorException();
		 }catch(KeySelectorException exception) {
			 System.out.println("Exception 32 ordered");
		 }
	 }
	 void Exception33() {
		 try {
			 throw new LambdaConversionException();
		 }catch(LambdaConversionException exception) {
			 System.out.println("Exception 33ordered");
		 }
	 }
	 void Exception34() {
		 try {
			 throw new LineUnavailableException();
		 }catch(LineUnavailableException exception) {
			 System.out.println("Exception 34 ordered");
		 }
	 }
	 void Exception36() {
		 try {
			 throw new MarshalException(null);
		 }catch(MarshalException exception) {
			 System.out.println("Exception 36 ordered");
		 }
	 }
	 void Exception37() {
		 try {
			 throw new MidiUnavailableException();
		 }catch(MidiUnavailableException exception) {
			 System.out.println("Exception 37 ordered");
		 }
	 }
	 void Exception38() {
		 try {
			 throw new MimeTypeParseException();
		 }catch(MimeTypeParseException exception) {
			 System.out.println("Exception 38 ordered");
		 }
	 }
	 void Exception39() {
		 try {
			 throw new NamingException();
		 }catch(NamingException exception) {
			 System.out.println("Exception 39 ordered");
		 }
	 }
	 void Exception40() {
		 try {
			 throw new NoninvertibleTransformException(null);
		 }catch(NoninvertibleTransformException exception) {
			 System.out.println("Exception 40 ordered");
		 }
	 }
	 void Exception41() {
		 try {
			 throw new NotBoundException();
		 }catch(NotBoundException exception) {
			 System.out.println("Exception 41 ordered");
		 }
	 }
	 void Exception42() {
		 try {
			 throw new ParseException(null, 0);
		 }catch(ParseException exception) {
			 System.out.println("Exception 42 ordered");
		 }
	 }
	 void Exception43() {
		 try {
			 throw new ParserConfigurationException();
		 }catch(ParserConfigurationException exception) {
			 System.out.println("Exception 43 ordered");
		 }
	 }
	 void Exception44() {
		 try {
			 throw new PrinterException();
		 }catch(PrinterException exception) {
			 System.out.println("Exception 44 ordered");
		 }
	 }
	 void Exception45() {
		 try {
			 throw new PrintException();
		 }catch(PrintException exception) {
			 System.out.println("Exception 45 ordered");
		 }
	 }
	 void Exception46() {
		 try {
			 throw new PrivilegedActionException(null);
		 }catch(PrivilegedActionException exception) {
			 System.out.println("Exception 46 ordered");
		 }
	 }
	 void Exception47() {
		 try {
			 throw new PropertyVetoException(null, null);
		 }catch(PropertyVetoException exception) {
			 System.out.println("Exception 47 ordered");
		 }
	 }
	 void Exception48() {
		 try {
			 throw new NotBoundException();
		 }catch(NotBoundException exception) {
			 System.out.println("Exception 48 ordered");
		 }
	 }
	 void Exception49() {
		 try {
			 throw new NotBoundException();
		 }catch(NotBoundException exception) {
			 System.out.println("Exception 49 ordered");
		 }
	 }
	 void Exception50() {
		 try {
			 throw new ReflectiveOperationException();
		 }catch(ReflectiveOperationException exception) {
			 System.out.println("Exception 50 ordered");
		 }
	 }
	 void Exception51() {
		 try {
			 throw new RefreshFailedException();
		 }catch(RefreshFailedException exception) {
			 System.out.println("Exception 51 ordered");
		 }
	 }
	 void Exception52() {
		 try {
			 throw new NotBoundException();
		 }catch(NotBoundException exception) {
			 System.out.println("Exception 52 ordered");
		 }
	 }
	 void Exception53() {
		 try {
			 throw new RuntimeException();
		 }catch(RuntimeException exception) {
			 System.out.println("Exception 53 ordered");
		 }
	 }
	 void Exception54() {
		 try {
			 throw new NotBoundException();
		 }catch(NotBoundException exception) {
			 System.out.println("Exception 54 ordered");
		 }
	 }
	 void Exception55() {
		 try {
			 throw new SAXException();
		 }catch(SAXException exception) {
			 System.out.println("Exception 55 ordered");
		 }
	 }
	 void Exception56() {
		 try {
			 throw new ScriptException(null, null, 0);
		 }catch(ScriptException exception) {
			 System.out.println("Exception 56 ordered");
		 }
	 }
	 void Exception57() {
		 try {
			 throw new ServerNotActiveException(null);
		 }catch(ServerNotActiveException exception) {
			 System.out.println("Exception 57 ordered");
		 }
	 }
	 void Exception58() {
		 try {
			 throw new SQLException(null, null, 0);
		 }catch(SQLException exception) {
			 System.out.println("Exception 58 ordered");
		 }
	 }
	 void Exception59() {
		 try {
			 throw new TimeoutException();
		 }catch(TimeoutException exception) {
			 System.out.println("Exception 59 ordered");
		 }
	 }
	 void Exception60() {
		 try {
			 throw new TooManyListenersException();
		 }catch(TooManyListenersException exception) {
			 System.out.println("Exception 60 ordered");
		 }
	 }
	 void Exception61() {
		 try {
			 throw new TransformerException("");
		 }catch(TransformerException exception) {
			 System.out.println("Exception 61 ordered");
		 }
	 }
	 void Exception62() {
		 try {
			 throw new TransformException();
		 }catch(TransformException exception) {
			 System.out.println("Exception 62 ordered");
		 }
	 }
	 void Exception63() {
		 try {
			 throw new UnmodifiableClassException();
		 }catch(UnmodifiableClassException exception) {
			 System.out.println("Exception 63 ordered");
		 }
	 }
	 void Exception64() {
		 try {
			 throw new UnsupportedAudioFileException();
		 }catch(UnsupportedAudioFileException exception) {
			 System.out.println("Exception 64 ordered");
		 }
	 }
	 void Exception65() {
		 try {
			 throw new UnsupportedCallbackException(null, null);
		 }catch(UnsupportedCallbackException exception) {
			 System.out.println("Exception 65 ordered");
		 }
	 }
	 void Exception66() {
		 try {
			 throw new UnsupportedFlavorException(null);
		 }catch(UnsupportedFlavorException exception) {
			 System.out.println("Exception 66 ordered");
		 }
	 }
	 void Exception67() {
		 try {
			 throw new UnsupportedLookAndFeelException(null);
		 }catch(UnsupportedLookAndFeelException exception) {
			 System.out.println("Exception 67 ordered");
		 }
	 }
	 void Exception68() {
		 try {
			 throw new URIReferenceException();
		 }catch(URIReferenceException exception) {
			 System.out.println("Exception 68 ordered");
		 }
	 }
	 void Exception69() {
		 try {
			 throw new URISyntaxException(null, null, 0);
		 }catch(URISyntaxException exception) {
			 System.out.println("Exception 69 ordered");
		 }
	 }
	 void Exception70() {
		 try {
			 throw new XMLParseException(null, null);
		 }catch(XMLParseException exception) {
			 System.out.println("Exception 70 ordered");
		 }
	 }
	 void Exception71() {
		 try {
			 throw new XMLSignatureException();
		 }catch(XMLSignatureException exception) {
			 System.out.println("Exception 71 ordered");
		 }
	 }
	 void Exception72() {
		 try {
			 throw new XMLStreamException();
		 }catch(XMLStreamException exception) {
			 System.out.println("Exception 72 ordered");
		 }
	 }
	 void Exception73() {
		 try {
			 throw new XPathException();
		 }catch(XPathException exception) {
			 System.out.println("Exception 73 ordered");
		 }
	 }
	 
}

	
	
	
	
	
	
	

