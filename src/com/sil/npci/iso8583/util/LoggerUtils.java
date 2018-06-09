package com.sil.npci.iso8583.util;

public class LoggerUtils {

	public static final String[] DEArray = new String[] {
			"| DE 000 : '", "| DE 001 : '", "| DE 002 : '", "| DE 003 : '", "| DE 004 : '", "| DE 005 : '", "| DE 006 : '", "| DE 007 : '", "| DE 008 : '", "| DE 009 : '", 
			"| DE 010 : '", "| DE 011 : '", "| DE 012 : '", "| DE 013 : '", "| DE 014 : '", "| DE 015 : '", "| DE 016 : '", "| DE 017 : '", "| DE 018 : '", "| DE 019 : '", 
			"| DE 020 : '", "| DE 021 : '", "| DE 022 : '", "| DE 023 : '", "| DE 024 : '", "| DE 025 : '", "| DE 026 : '", "| DE 027 : '", "| DE 028 : '", "| DE 029 : '", 
			"| DE 030 : '", "| DE 031 : '", "| DE 032 : '", "| DE 033 : '", "| DE 034 : '", "| DE 035 : '", "| DE 036 : '", "| DE 037 : '", "| DE 038 : '", "| DE 039 : '", 
			"| DE 040 : '", "| DE 041 : '", "| DE 042 : '", "| DE 043 : '", "| DE 044 : '", "| DE 045 : '", "| DE 046 : '", "| DE 047 : '", "| DE 048 : '", "| DE 049 : '", 
			"| DE 050 : '", "| DE 051 : '", "| DE 052 : '", "| DE 053 : '", "| DE 054 : '", "| DE 055 : '", "| DE 056 : '", "| DE 057 : '", "| DE 058 : '", "| DE 059 : '", 
			"| DE 060 : '", "| DE 061 : '", "| DE 062 : '", "| DE 063 : '", "| DE 064 : '", "| DE 065 : '", "| DE 066 : '", "| DE 067 : '", "| DE 068 : '", "| DE 069 : '", 
			"| DE 070 : '", "| DE 071 : '", "| DE 072 : '", "| DE 073 : '", "| DE 074 : '", "| DE 075 : '", "| DE 076 : '", "| DE 077 : '", "| DE 078 : '", "| DE 079 : '", 
			"| DE 080 : '", "| DE 081 : '", "| DE 082 : '", "| DE 083 : '", "| DE 084 : '", "| DE 085 : '", "| DE 086 : '", "| DE 087 : '", "| DE 088 : '", "| DE 089 : '", 
			"| DE 090 : '", "| DE 091 : '", "| DE 092 : '", "| DE 093 : '", "| DE 094 : '", "| DE 095 : '", "| DE 096 : '", "| DE 097 : '", "| DE 098 : '", "| DE 099 : '", 
			"| DE 100 : '", "| DE 101 : '", "| DE 102 : '", "| DE 103 : '", "| DE 104 : '", "| DE 105 : '", "| DE 106 : '", "| DE 107 : '", "| DE 108 : '", "| DE 109 : '", 
			"| DE 110 : '", "| DE 111 : '", "| DE 112 : '", "| DE 113 : '", "| DE 114 : '", "| DE 115 : '", "| DE 116 : '", "| DE 117 : '", "| DE 118 : '", "| DE 119 : '", 
			"| DE 120 : '", "| DE 121 : '", "| DE 122 : '", "| DE 123 : '", "| DE 124 : '", "| DE 125 : '", "| DE 126 : '", "| DE 127 : '", "| DE 128 : '", "| DE 129 : '"
	};
	
	public static final String[] DE = new String[] {
			"|000 : '", "|001 : '", "|002 : '", "|003 : '", "|004 : '", "|005 : '", "|006 : '", "|007 : '", "|008 : '", "|009 : '", 
			"|010 : '", "|011 : '", "|012 : '", "|013 : '", "|014 : '", "|015 : '", "|016 : '", "|017 : '", "|018 : '", "|019 : '", 
			"|020 : '", "|021 : '", "|022 : '", "|023 : '", "|024 : '", "|025 : '", "|026 : '", "|027 : '", "|028 : '", "|029 : '", 
			"|030 : '", "|031 : '", "|032 : '", "|033 : '", "|034 : '", "|035 : '", "|036 : '", "|037 : '", "|038 : '", "|039 : '", 
			"|040 : '", "|041 : '", "|042 : '", "|043 : '", "|044 : '", "|045 : '", "|046 : '", "|047 : '", "|048 : '", "|049 : '", 
			"|050 : '", "|051 : '", "|052 : '", "|053 : '", "|054 : '", "|055 : '", "|056 : '", "|057 : '", "|058 : '", "|059 : '", 
			"|060 : '", "|061 : '", "|062 : '", "|063 : '", "|064 : '", "|065 : '", "|066 : '", "|067 : '", "|068 : '", "|069 : '", 
			"|070 : '", "|071 : '", "|072 : '", "|073 : '", "|074 : '", "|075 : '", "|076 : '", "|077 : '", "|078 : '", "|079 : '", 
			"|080 : '", "|081 : '", "|082 : '", "|083 : '", "|084 : '", "|085 : '", "|086 : '", "|087 : '", "|088 : '", "|089 : '", 
			"|090 : '", "|091 : '", "|092 : '", "|093 : '", "|094 : '", "|095 : '", "|096 : '", "|097 : '", "|098 : '", "|099 : '", 
			"|100 : '", "|101 : '", "|102 : '", "|103 : '", "|104 : '", "|105 : '", "|106 : '", "|107 : '", "|108 : '", "|109 : '", 
			"|110 : '", "|111 : '", "|112 : '", "|113 : '", "|114 : '", "|115 : '", "|116 : '", "|117 : '", "|118 : '", "|119 : '", 
			"|120 : '", "|121 : '", "|122 : '", "|123 : '", "|124 : '", "|125 : '", "|126 : '", "|127 : '", "|128 : '", "|129 : '"
	};
	
	public static void main(String[] args) {
		for(int i=0; i<=129; i++) {
			if(i%10 == 0) System.out.println	();
			System.out.print("\"|"+String.format("%03d", i)+" : '\", ");
		}
	}
}