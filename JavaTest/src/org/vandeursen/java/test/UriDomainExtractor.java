package org.vandeursen.java.test;

import java.net.URI;
import java.net.URISyntaxException;

import org.htmlparser.Parser;
import org.htmlparser.filters.LinkRegexFilter;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

public class UriDomainExtractor {

	public static void main(String[] args) {
		String url = "https://www.abnamro.nl/nl/prive/index.html";
		try {
			URI uri = new URI(url);
			String domain = uri.getHost();
			System.out.println(domain);
			final Parser htmlParser = new Parser(url);
			String domainRegex = ".*"+domain+".*";
			LinkRegexFilter linkRegexFilter = new LinkRegexFilter(domainRegex);
	        final NodeList tagNodeList = htmlParser.extractAllNodesThatMatch(linkRegexFilter);
	        for (int j = 0; j < tagNodeList.size(); j++) {
	            final LinkTag loopLink = (LinkTag) tagNodeList.elementAt(j);
	            final String loopLinkStr = loopLink.getLink();
	            System.out.println(loopLinkStr);
	        }
	        // multicatch exception example
		} catch (URISyntaxException|ParserException e) {
			e.printStackTrace();
		}

	}

}
