public class StringCompressor{

	public String res;

	private String update_string(String main_string, char letter, int letter_count){
		main_string += letter;
		main_string += letter_count;
		return main_string;
	}

	public StringCompressor(String arg_1){

		String new_string = "";
		char letter_buffer = '\0';
		int last_char_int = 0;

		for(int i = 0; i < arg_1.length(); i++){
			char this_char = arg_1.charAt(i);
			if(letter_buffer == '\0'){
				letter_buffer = this_char;
				last_char_int++;
			} else if (this_char == letter_buffer) {
				last_char_int++;
			} else {
				new_string = this.update_string(new_string, letter_buffer, last_char_int);
				letter_buffer = this_char;
				last_char_int = 1;
			}
		}

		new_string = this.update_string(new_string, letter_buffer, last_char_int);

		if(new_string.length() < arg_1.length()){
			res = new_string;
		} else {
			res = arg_1;
		}
	}

}
