grammar testOpe;

options
{
    language=Java;
}


progr        : add ;
 
add : mult (addSubtractOp add)?
	;	
 
mult
	: and (multiplyDivideOp  mult)? 
	;

and
	: comp ('&&'  and)* 	
	;
 
comp
	: or (comparatorOp  comp)* 	
	;
 
or 	: puis ('||'  or)*  
	;
 
puis	
	:  expressionAtom ('^' puis)*
	;
 
	
 expressionAtom
	: 
	|   INT
	|  ( '(' add ')' ) 
	;
 
 
addSubtractOp 
	:	'+'
	|       	'-'
	;    
 
multiplyDivideOp 
	:	'*' 
	|       	'/'
	;    
 
comparatorOp 
	:	'>'
	|       	'<'
	| 	'>='
	|	'<='
	|	'!='
	;


INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

