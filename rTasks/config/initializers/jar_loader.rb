Dir.entries("#{RAILS_ROOT}/lib").sort.each do |entry|
  if entry =~ /.jar$/
    require entry
  end
end

require 'application_context'