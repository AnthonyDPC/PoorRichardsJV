import java.util.*;

public class PoorRichardsAlmanack {
    public static void main(String[] args) {
        
        // Benjamin Franklin's wisdom by topic
        Map<String, List<String>> quotes = new HashMap<>();
        
        quotes.put("money", Arrays.asList(
            "A penny saved is a penny earned.",
            "The borrower is a slave to the lender.",
            "Rather go to bed supperless than rise in debt."
        ));
        
        quotes.put("life", Arrays.asList(
            "Early to bed and early to rise, makes a man healthy, wealthy, and wise.",
            "Fish and visitors stink in three days.",
            "Three may keep a secret, if two of them are dead."
        ));
        
        quotes.put("wisdom", Arrays.asList(
            "Lost time is never found again.",
            "Well done is better than well said.",
            "Haste makes waste."
        ));
        
        quotes.put("work", Arrays.asList(
            "No gains without pains.",
            "Keep thy shop, and thy shop will keep thee.",
            "Industry need not wish."
        ));
        
        // Display welcome message
        System.out.println("\n=== Poor Richard's Almanack ===");
        System.out.println("Type 0 to exit\n");
        
        // Setup random generator
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display menu
            System.out.println("Choose a Topic:");
            System.out.println("1. Money |2. Life |3. Wisdom |4. Work |5. Virtues");
            System.out.print("Your choice: ");
            
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!\n");
                continue;
            }
            
            // Exit condition
            if (choice == 0) {
                System.out.println("\nFarewell, friend!");
                break;
            }
            
            // Validate and display quote
            else if (choice >= 1 && choice <= 4) {
                // Map choice to topic string
                String topic;
                switch (choice) {
                    case 1:
                        topic = "money";
                        break;
                    case 2:
                        topic = "life";
                        break;
                    case 3:
                        topic = "wisdom";
                        break;
                    case 4:
                        topic = "work";
                        break;
                    case 5:
                        topic = "virtues";
                        break;
                    default:
                        topic = "";
                }
                
                List<String> quoteList = quotes.get(topic);
                String quote = quoteList.get(random.nextInt(quoteList.size()));
                System.out.println("\n\"" + quote + "\"\n");
            } 
            else if(choice == 5){
                System.out.println("\n1. TEMPERANCE: Eat not to dullness; drink not to elevation.");
                System.out.println("2. SILENCE: Speak not but what may benefit others or yourself; avoid trifling conversation.");
                System.out.println("3. ORDER: Let all your things have their places; let each part of your business have its time.");
                System.out.println("4. RESOLUTION: Resolve to perform what you ought; perform without fail what you resolve.");
                System.out.println("5. FRUGALITY: Make no expense but to do good to others or yourself; waste nothing.");
                System.out.println("6. INDUSTRY: Lose no time; be always employed in something useful; cut off all unnecessary actions.");
                System.out.println("7. SINCERITY: Use no hurtful deceit; think innocently and justly, and, if you speak, speak accordingly.");
                System.out.println("8. JUSTICE: Wrong none by doing injuries or omitting the benefits that are your duty.");
                System.out.println("9. MODERATION: Avoid extremes; forbear resenting injuries so much as you think they deserve.");
                System.out.println("10. CLEANLINESS: Tolerate no uncleanliness in body, clothes, or habitation.");
                System.out.println("11. TRANQUILLITY: Be not disturbed at trifles or at accidents common or unavoidable.");
                System.out.println("12. CHASTITY: Rarely use venery but for health or offspring, never to dullness or weakness.");
                System.out.println("13. HUMILITY: Imitate Jesus and Socrates.\n");
            }
            else{
                System.out.println("Invalid choice. Pick 1-5 or 0 to exit.");
            }
        }
        
        scanner.close();
    }
}