package springdev.jokechucknorrise.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by oleht on 15.12.2017
 */
@Service
public class ChuckNorriseQuotesServiceImpl implements ChuckNorriseQuotesService {

    private final ChuckNorrisQuotes quotes;

    public ChuckNorriseQuotesServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getChacksQuot() {
        return quotes.getRandomQuote();
    }

}
